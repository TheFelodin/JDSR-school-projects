package passwortklasse;

public class PasswortTest {

	public static void main(String[] args) {
		char[] pwd_first = "PassWD15!!".toCharArray();
		char[] pwd_weak = "1234567890".toCharArray();
		char[] pwd_strong = "NewPWD16!!".toCharArray();

		// Erzeuge ein neues Passwortobjekt und setze das
		// Passwort auf "PassW15!!"

		Passwort pwd = new Passwort(pwd_first);

		// Ändere Passwort auf "1234567890"
		// Klappt nicht, weil das neue Passwort schwach ist
		System.out.println(pwd.change(pwd_first, pwd_weak));

		// Verändern der lokalen pwd_first-Variablen
		// Darf keine Auswirkungen auf das Passwort im pwd-Objekt haben.
		pwd_first[0] = 'p';

		// Ändere Passwort auf "NewPWD16!!"
		// Klappt nicht, weil das alte Passwort nicht stimmt
		System.out.println(pwd.change(pwd_first, pwd_strong));

		// Zurücksetzen der lokalen pwd_first-Variablen
		// Darf keine Auswirkungen auf das Passwort im pwd-Objekt haben.
		pwd_first[0] = 'P';

		// Ändere Passwort auf "NewPWD16!!"
		// Klappt, weil das alte Passwort stimmt und
		// das neue Passwort stark ist
		System.out.println(pwd.change(pwd_first, pwd_strong));
	}

}
