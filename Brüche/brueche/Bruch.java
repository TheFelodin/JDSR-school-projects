package brueche;

public class Bruch {
	private int zaehler;
	private int nenner;
	public static boolean gemischterBruch;

	public Bruch() {
		setZaehlerUndNenner(0, 1);
	}

	public Bruch(int z) {
		setZaehlerUndNenner(z, 1);
	}

	public Bruch(int z, int n) {
		setZaehlerUndNenner(z, n);
	}

	public void setZaehlerUndNenner(int z, int n) {
		setZaehler(z);
		setNenner(n);
	}

	public void setNenner(int n) {
		if (n == 0) {
			System.err.println("Nenner darf nicht Null sein");
			System.exit(-1);
		}
		this.nenner = n;

	}

	public void setZaehler(int z) {
		zaehler = z;
	}

	public int getZaehler() {
		return zaehler;
	}

	public int getNenner() {
		return nenner;
	}

	public String toString() {
		kuerze();
		if (gemischterBruch && Math.abs(zaehler) >= Math.abs(nenner)) {
			int ganzeZahl = zaehler / nenner;
			int rest = zaehler % nenner;
			return ganzeZahl + " " + Math.abs(rest) + "/" + nenner;
		}
		return zaehler + "/" + nenner;
	}

	private void kuerze() {
		int vorzeichen = 1;
		if (zaehler < 0 && nenner > 0 || zaehler > 0 && nenner < 0)
			vorzeichen = -1;
		int m = Math.abs(zaehler);
		int n = Math.abs(nenner);
		int teiler = ggT(m, n);
		setZaehlerUndNenner(vorzeichen * m / teiler, n / teiler);
	}

	private int ggT(int m, int n) { // m <- 8, n <- 12
		int r = 1;
		while (r != 0) {
			r = m % n; // r <- 8; 4; 0
			if (r == 0)
				return n; // return 4
			m = n; // m <- 12; 8
			n = r; // n <- 8; 4
		}
		return 1;
	}

	public void multipliziereMit(int z, int n) {
		setZaehlerUndNenner(zaehler * z, nenner * n);
	}

	public void multipliziereMit(Bruch b) {
		setZaehlerUndNenner(zaehler * b.getZaehler(), nenner * b.getNenner());
	}

	public static Bruch multipliziereMit(Bruch bruchEins, Bruch bruchZwei) {
		return new Bruch(bruchEins.getZaehler() * bruchZwei.getZaehler(),
				bruchEins.getNenner() * bruchZwei.getNenner());
	}

	public static boolean isGemischterBruch() {
		return gemischterBruch;
	}

}
