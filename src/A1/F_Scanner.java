package A1;

import java.util.Scanner;

public class F_Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // var è un tipo astratto/indeterminato, che va bene o meno, quando non si sa cosa sia (posso usare Scanner come tipo che è meglio)
        // Scanner è semplicemente un nome dell'oggetto
        // l'oggetto è un nuovo (new) oggetto classe scanner
        // Scanner(System.in) sono il costruttore e i parmametri della classe, qui leggiamo in entrata
        //Dialogo con l'utente
        System.out.println("Inserisci un numero intero");
        int primoNumero = scanner.nextInt();
        System.out.println("Hai inserito: " + primoNumero);

        System.out.println("Inserisci un secondo numero intero");
        int secondoNumero = scanner.nextInt();
        System.out.println("Hai inserito: " + secondoNumero);

        int somma = primoNumero + secondoNumero;

        System.out.println("La somma è " + somma);

    }
}
