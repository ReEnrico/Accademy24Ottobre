package B_MetodiSemplici;

import java.util.Scanner;

/*    ESERCIZIO 3
       Creare una classe che si chiama G_ConvertitoreImperiale
      * Crea un metodo chiamato trasponiPiediEPolliciInCentimetri
      Deve avere due parametri.
      piedi è il primo parametro, pollici è il secondo parametro
      Controlla che il primo parametro piedi sia >= 0
      Controlla che il secondo parametro pollici sia >=0 e <=12
      Restituisci un errore di inserimento dal metodo se uno dei precedenti non è vero
      Se i parametri sono validi, calcola quanti centimetri
      corrispondono ai valori di piedi e pollici passati a questo metodo e ritorna
      quel valore.
     * ________________________________________________
     *
      Crea un secondo metodo con lo stesso nome ma con un solo parametro
      pollici è il parametro
      convalida che sia >=0 e
      Restituisci un errore di inserimento se non è vero
      Se è valido, allora calcola quanti piedi ci stanno in quei pollici
      e se avanzano dei pollici portati dietro anche quelli
      Infine chiama l'altro metodo Overloadato passando i piedi e i pollici corretti
      scritto in modo che possa calcolare correttamente.
      *
      Suggerimenti: usare double per i tipi di dati numerici è una buona idea
      1 pollice = 2,54 cm e un piede = 12 pollici
      *
      * NOTA: potete usare format() e/o DecimalFormat()
      * per limitare il numero delle cifre decimali del risultato
 */

public class G_ConvertitoreDaMarco {

        public static void main(String[] args) {
            var scanner = new Scanner(System.in);
            while (!mainLoop(scanner)) { }
        }

        /***
         * Main loop of the function.
         * @param scanner  Scanner to read input from.
         * @return         True if no error.
         */
        private static Boolean mainLoop(Scanner scanner) {
            var pollici = getDouble(scanner, "Inserisci il numero di pollici: ");
            try {
                System.out.printf("%.2f", trasponiPiediEPolliciInCentimetri(pollici));
                return true;
            }
            catch (Exception e) {
                System.out.println("Errore di inserimento.");
                return false;
            }
        }

        /***
         *
         * @param piedi      Lunghezza in piedi
         * @param pollici    Lunghezza in pollici
         * @return           Lunghezza in centimetri
         * @throws Exception Numero di piedi negativo o numero di pollici fuori dall'intervallo [0, 12]
         */
        private static Double trasponiPiediEPolliciInCentimetri(Double piedi, Double pollici) throws Exception {
            // Parameter validation
            if (piedi < 0) {
                throw new Exception("Errore di inserimento: numero di piedi negativo.");
            }
            if (pollici < 0 || pollici > 12) {
                throw new Exception("Errore di inserimento: il numero di pollici deve essere compreso fra 0 e 12");
            }
            return 2.54 * (pollici + 12 * piedi);
        }

        private static Double trasponiPiediEPolliciInCentimetri(Double pollici) throws Exception {
            // Parameter validation
            if (pollici < 0) {
                throw new Exception("Errore di inserimento: il numero di pollici deve essere compreso fra 0 e 12");
            }
            // return trasponiPiediEPolliciInCentimetri(Math.floorDiv(pollici, 12), Math.floorMod(pollici, 12));
            Double pollicini = pollici % 12;
            return trasponiPiediEPolliciInCentimetri((pollici - pollicini) / 12, pollicini);
        }

        private static Double getDouble(Scanner scanner, String message) {
            System.out.print(message);
            try {
                return scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Errore: l'input non è un numero double.");
                scanner.nextLine();
                return getDouble(scanner, message);
            }
        }
}

