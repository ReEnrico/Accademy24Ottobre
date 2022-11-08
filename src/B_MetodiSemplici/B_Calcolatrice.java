package B_MetodiSemplici;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/***
 * In questa classe si crea una semplice calcolatrice che svolge le quattro operazioni fondamentali.
 * L'utente sceglie due numeri e l'operazione da eseguire.
 * @author Enrico Re
 * @version 1.0
 */
public class B_Calcolatrice {
    /***
     * Nel main è presente un ciclo while che permette all'utente di continuare i calcoli,
     * fino a che non decida di interrompere volontariamente.
     * Il metodo che effettua i calcoli è implementato all'esterno del main.
     * @return  Visualizza sul terminale il risultato dell'operazione.
     * @see "operators".
     * @param args
     * @throws IOException serve per gestire le eccezioni di BufferedReader
     * @throws ArithmeticException  serve per evitare che l'utente indichi un numero che non corrisponde ad un'operazione
     * #param   bufferedReader  serve per inserire l'input dell'utente
     * #param   firstInput  primo numero inserito dell'utente (tipo double)
     * #param   secondInput secondo numero inserito dall'utente (tipo double)
     * #param   operator    fa scegliere all'utente l'operazione da compiere (tipo int)
     * #param   controll    fa scegliere se continuare con le operazioni
     * @comment Non va bene il modo con cui è gestito l'errore di operazione non valida. Aggiungere eccezioni per inserzioni di oggetti che non sono numeri
     */
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        /*Start*/
        String controll = "y";
        while (controll.equalsIgnoreCase("y")) {
            System.out.println("Inserisci il primo numero (se con decimali, si usi \".\" per indicarli)");
            double firstInput = Double.parseDouble(bufferedReader.readLine());

            System.out.println("Inserisci il secondo numero (se con decimali, si usi \".\" per indicarli)");
            double secondInput = Double.parseDouble(bufferedReader.readLine());

            System.out.println("""
                           Scegli l'operazione matematica fra le seguenti:
                           1 -> somma
                           2 -> differenza
                           3 -> prodotto
                           4 -> divisione""");
            int operator = Integer.parseInt(bufferedReader.readLine());
            if (operator >= 5 || operator < 1){
                //throw new ArithmeticException("Operazione selezionata non esistente.");
                System.out.println("Operazione selezionata non esistente.");
                continue;
            } else {
                double result = operators(operator, firstInput, secondInput);
                System.out.println("Il risultato dell'operazione scelta è: " + result);
            }
            System.out.println("Nuovo calcolo? [Y/N]");
            controll = bufferedReader.readLine();
        } //while (controll.equalsIgnoreCase("y"));


    }/*end main*/

    /***44
     * Metodo che effettua le quattro operazioni matematiche fondamentali.
     * In base al valore della variabile operation viene scelta una delle quattro operazioni.
     * La divisione per zero (operzione numero 4) è gestita con un return a parte
     * @param operation     operazione scelta dall'utente (tipo int)
     * @param firstNumber   primo numero scelto dall'utente (tipo double)
     * @param secondNumber  secondo numero scelto dall'utente (tipo double)
     * @return  riporta il risultato dell'operazione
     * @comment Non va bene il modo con cui è gestita la divisione per 0
     */
    private static double operators(int operation, double firstNumber, double secondNumber){
        if(operation == 1){
            return firstNumber + secondNumber;
        } else if (operation == 2) {
            return firstNumber - secondNumber;
        } else if (operation == 3) {
            return firstNumber * secondNumber;
        }else {
            if (secondNumber != 0){
                return firstNumber / secondNumber;
            } else {
                System.out.println("Purtroppo sono una semplice calcolatrice e non conosco il concetto di limite");
                return 0;
            }

        }/*end operatore*/
    }
}
