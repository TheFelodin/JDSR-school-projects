package MotorradBeispiel;

public class Motorradtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motorrad meinMotorrad = new Motorrad(new Motor(62,0.6), new Reifen(60, 2.5, "Sommer"), new Reifen(65, 2.5, "Sommer"));
		
		System.out.println(meinMotorrad.getVorderreifen().getDurchmesser());
		System.out.println(meinMotorrad);
		
		meinMotorrad.gibInfo();
	}

}
