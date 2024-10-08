package mqtt_package;

import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class MQTT_LWT_Client {

    public static void main(String[] args) {

        String broker = "tcp://test.mosquitto.org:1883";
        String clientId = "JavaLWTClient";
        String lwtTopic = "MQTT/LWT";
        String lwtMessage = "Client has disconnected unexpectedly";
        int qos = 2;
        MemoryPersistence persistence = new MemoryPersistence();

        try {
            // MQTT Client erstellen
            MqttClient client = new MqttClient(broker, clientId, persistence);

            // Verbindungsoptionen mit Last Will and Testament konfigurieren
            MqttConnectOptions connOpts = new MqttConnectOptions();
            connOpts.setCleanSession(true);
            connOpts.setWill(lwtTopic, lwtMessage.getBytes(), qos, false);

            System.out.println("Connecting to broker: " + broker);
            client.connect(connOpts);
            System.out.println("Connected");

            // Abonniere das LWT-Thema
            client.subscribe(lwtTopic);
            // Abonniere das Testthema
            client.subscribe("MQTT Examples");

            // Nachrichten senden, um den Client zu testen
            String topic = "MQTT Examples";
            String messageContent = "Client is connected!";
            MqttMessage message = new MqttMessage(messageContent.getBytes());
            message.setQos(qos);
            client.publish(topic, message);
            System.out.println("Message published: " + messageContent);

            // Callback setzen, um das Verhalten zu überwachen
            client.setCallback(new MqttCallback() {
                @Override
                public void connectionLost(Throwable cause) {
                    System.out.println("Connection lost! Cause: " + cause);
                }

                @Override
                public void messageArrived(String topic, MqttMessage message) throws Exception {
                    System.out.println("Message arrived: " + new String(message.getPayload()));
                }

                @Override
                public void deliveryComplete(IMqttDeliveryToken token) {
                    System.out.println("Delivery complete");
                }
            });

            // Simuliere eine unerwartete Trennung, indem der Client nach 10 Sekunden beendet wird
            Thread.sleep(10000); // 10 Sekunden warten
            System.out.println("Simulating unexpected disconnection...");
            client.disconnectForcibly();
            System.out.println("Client disconnected");

        } catch (MqttException me) {
            System.out.println("reason " + me.getReasonCode());
            System.out.println("msg " + me.getMessage());
            System.out.println("loc " + me.getLocalizedMessage());
            System.out.println("cause " + me.getCause());
            me.printStackTrace();
        } catch (InterruptedException ie) {
            System.out.println("Interrupted exception: " + ie.getMessage());
            ie.printStackTrace();
        }
    }
}
