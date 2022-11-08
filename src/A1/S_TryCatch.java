package A1;

import java.util.Scanner;

public class S_TryCatch {
    public static void main(String[] args) {
       /* String unaStringaNulla = null;
        try {
            String stringaCorta = unaStringaNulla.substring(2);
        } catch (Exception e){
            System.out.println("C'è un errore");//da il mio messaggio di errore che impedisce il crash dell'applicazione
            e.printStackTrace();
        }*/ //finally {//questo blocco viene visto comunque, si mette messaggio o strategia fallback
            /* fallback significa prevedere strategia alternativa al metodo principale
             per effettuare la stessa operazione. Solo che viene eseguito anche se il metodo principale funziona
             quindi deve essere impostato per bene; solitamente serve per gestire multi-programma.
             Altra alternativa */

        //}
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci età");
        int eta = scanner.nextInt();
        /*io voglio fermare app*/
        if (eta < 18){
            throw new ArithmeticException("Non puoi entrare");
        } else {
            System.out.println("Okay puoi entrare");
        }/* questo modo serve quando c'è uno strato intermedio fra programma e utente, in pratica serve per mandare
        un messaggio di errore in interfaccia grafica*/
    }
}
