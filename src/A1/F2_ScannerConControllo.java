package A1;

import java.util.Scanner;

public class F2_ScannerConControllo {
    public static void main(String[] args) {
        /* se si usa un solo oggetto di una classe,
        * si mette lo stesso nome della classe*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci l'anno di nascita:");

        /* questo è il controllo, quindi ha il nome del metodo che si usa
        * come controllo*/
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt){
            int annoDiNascita = scanner.nextInt();
            scanner.nextLine();// serve per far avanzare, oppure fermare in un loop infinito, o per prendere una stringa multitoken

            /* devo far avanzare l'applicazione di forza*/
            System.out.println("Inserisci il tuo nome:");
            String nomeUtente = scanner.nextLine();

            int eta = 2022 - annoDiNascita;

            /* Secondo controllo su range di validità*/
            if (eta >= 0 && eta <= 120){
                System.out.println("Il tuo nome è: " + nomeUtente +
                        " e hai " + eta + " anni");
            } else {
                System.out.println("Età fuori scala, inserire un numero fra 0 e 120");
            }
        } else {
            System.out.println("Anno di nascita non valido, inserire un valore come 1994");
        }

    }
}
