package brueche;

public class Bruch {
		private int zaehler;                   // 0
		private int nenner = 1;
	
		public Bruch() {
				setZaehlerUndNenner( 0, 1 );
		}
	
		public Bruch( int z ) {
				setZaehlerUndNenner( z, 1 );
		}
	
		public Bruch( int z, int n ) {
				setZaehlerUndNenner( z, n );
		}
	
		public int getZaehler() {
				return zaehler;
		}
		public void setZaehler(int zaehler) {
				this.zaehler = zaehler;
		}
		public int getNenner() {
				return nenner;
		}
		public void setNenner(int nenner) {
				if( nenner == 0){
						System.err.println("Nenner darf nicht Null sein");
						System.exit(-1);
				}
				this.nenner = nenner;
		}
	

		// Rufen Sie hier die Methoden setZaehler() und setNenner() auf
		public void setZaehlerUndNenner( int z, int n ){

		}

		// hier ist die richtige Stelle um die Methode kuerze() aufzurufen
		// Basteln Sie dann einen Bruch "zaehler / nenner" und geben Sie ihn zurueck
		public String toString(){

		}

		// diese Methode ermittelt und gibt den groessten gemeinsamen Teiler (ggT)
		// zweier positiven Zahlen m und n zurueck
		private int ggT( int m, int n ){

		}

		// hier sollen Zaehler und Nenner gekürzt werden.
		// Tipp: speichern Sie zuerst das vorzeichen
		private void kuerze(){
				
		}

		// hier wird der eigene Buch zu Bruch b addiert und abgespeichert.
		public void addiereMit(  Bruch b ){
				
		}
		
				// hier wird der eigene Buch mit Bruch b multipliziert und abgespeichert.
		public void multipliziereMit( Bruch b ) {
				
		}
}
	
	
