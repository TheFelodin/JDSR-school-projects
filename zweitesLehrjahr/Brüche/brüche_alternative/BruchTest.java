package brüche_alternative;

public class BruchTest {

		public static void main(String[] args) {
				Bruch bruchEins = new Bruch();
		
				bruchEins.setZaehler( 4 );
				bruchEins.setNenner( 9 );
		
		    // die toString-Methode wird automatisch aufgerufen
		    // syso( bruchEins.toString() ist identisch mit syso( bruchEins )
				System.out.println( "Der erste Bruch lautet "
													 + bruchEins );
		
				Bruch bruchZwei = new Bruch();
				bruchZwei.setZaehlerUndNenner( 11, 9 );
		
				System.out.println("Der zweite Bruch lautet "
													 + bruchZwei );
		

				// addieren Sie bruchZwei zu bruchEins und geben Sie die
				// komplette Rechnung auf der Konsole aus, also
				// 4/9 + 11/9 = 15/9
				System.out.print( bruchEins );
				bruchEins.addiereMit(bruchZwei);
				System.out.println( " + " + bruchZwei + " = " + bruchEins);


				// subtrahieren Sie bruchZwei von bruchEins und geben Sie die
				// komplette Rechnung auf der Konsole aus, also
				// 4/9 - 11/9 = -7/9
				bruchEins.setZaehlerUndNenner( 4, 9 );
				bruchZwei.setZaehlerUndNenner( 11, 9 );
				
				System.out.print( bruchEins );
				bruchEins.subtrahiereVon(bruchZwei);
				System.out.println( " - " + bruchZwei + " = " + bruchEins);
				
        

				bruchEins.setZaehlerUndNenner( 4, 3 );
				bruchZwei.setZaehlerUndNenner( 9, 5 );

        // multiplizieren Sie bruchZwei mit bruchEins und geben Sie die
				// komplette Rechnung auf der Konsole aus, also
				// 4/2 * 9/5 = 12/5
				System.out.print( bruchEins );
				bruchEins.multipliziereMit(bruchZwei);
				System.out.println( " * " + bruchZwei + " = " + bruchEins);

				bruchEins.setZaehlerUndNenner( 4, -3 );
				bruchZwei.setZaehlerUndNenner( 8, 5 );

        // dividieren Sie bruchZwei durch bruchEins und geben Sie die
				// komplette Rechnung auf der Konsole aus, also
				// 4/-3 : 8/5 = -5/6
				
				System.out.print( bruchEins );
				bruchEins.dividiereDurch(bruchZwei);
				System.out.println( " : " + bruchZwei + " = " + bruchEins);
		}
}
