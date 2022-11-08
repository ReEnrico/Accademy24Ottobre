package G1_Esercitazioni;

import java.util.Scanner;

public class ComputerPensa {
    /*1) Un semplice gioco: il computer "pensa" un numero tra 1 e 9 e l'utente ha tre tentativi per indovinarlo. Se ce la fa
    entro 3 tentativi, vince, altrimenti perde e in ogni caso puo' decidere se ricominciare il gioco o smettere.*/




    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        giocoCompleto(scanner);


    }/*end main*/

    public static int estrazioneComputer (){
        int numeroComputer = (int)(Math.random()*9)+1;
        return numeroComputer;
    }/*end estrazione pc*/

    public static int prendiInput(Scanner scanner){
        int utenteInput = scanner.nextInt();
        return utenteInput;
    }/*end input*/

    public static void giocoCompleto(Scanner scanner){
         int sceltaPc = estrazioneComputer();

         int tentativi = 3;
         while (tentativi > 0){
             int sceltaUtente = prendiInput(scanner);
             tentativi--;
             if (sceltaPc == sceltaUtente){
                 System.out.println("Ottimo! Hai indovinato!");
             } else {
                 System.out.println("Peccato, riprova! Hai ancora " + tentativi + " tentativi");
             }
         }
         System.out.println("Vuoi continuare? [Sì/No]");
         String risposta = scanner.nextLine();
         if (risposta.equalsIgnoreCase("Sì")){
             giocoCompleto(scanner);
         } else {
             System.out.println("Alla prossima!");
         }
    }

}
