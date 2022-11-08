package A1;
import java.util.Scanner;

public class C_IfElse {
    public static void main(String[] args) {
        /*int numero = 7;
        if (numero >= 5){
            System.out.println("Il numero è maggiore di 5 ");
        } else {
            System.out.println("Il numero è minore di 5");
        }
        boolean condizione = true;
        if (condizione) {//come in python if check se è vero
            System.out.println("La condizione è vera");
        }*/

        /* AND e Or*/
        /*
        int primoNumero = 45;
        int secondoNumero = 3;
        // and è rapprsentato da &&
        if (primoNumero > 10 && secondoNumero < 10){// va bene mettere le due condizioni in tonde separate, meglio.
            System.out.println("Entrambe devono essere vere");
        }
        // or è rappresentato da ||
        if (primoNumero > 100 || secondoNumero < 10){
            System.out.println("Ne basta una sola vera");
        }
        int numTest = 20;
        if (numTest >= 10){
            System.out.println("Maggiore di 10");
        } else if (numTest <= 100) {
            System.out.println("Numero minore di 100");
        }
        else{
            System.out.println("Numero maggiore di 100");
        }*/

        //semi-vanity code
        //int etaUtente = 16;
        /* per accorciare if else OPERATORE TERNARIO
         * gli assegnamenti non è necessario siano true e false
         * l'importante è l'ordine vero - falso
         * l'importante è che il tipo detto all'inizio del ternario sia rispettato dopo
         */
        /*
        boolean maggiorenne = etaUtente > 18 ? true : false;
        if (maggiorenne){
            System.out.println("Può entrare");
        } else {
            System.out.println("Troppo piccolo torna casa");
        }
        */
        // Primo Esercizio
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica un numero, ti dirò se pari o dispari");
        int numbUtente = scanner.nextInt();
        scanner.nextLine();
        float control = numbUtente%2;
        boolean parita = control == 0 ? true : false;
        if (parita){
            System.out.println("Il numero scelto è pari");
        } else {
            System.out.println("Il numero scelto è dispari");
        }
    }
}
