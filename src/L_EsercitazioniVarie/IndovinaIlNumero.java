package L_EsercitazioniVarie;

import java.util.Random;
import java.util.Scanner;

public class IndovinaIlNumero {
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Scrivi il nome che vuoi dare alla partita (meglio se non si usano spazi fra le parole)");
        String nomePartita = scanner.nextLine();
        SalvataggioFile roundTxt = new SalvataggioFile(nomePartita);
        int count = 1;
        int risposta;
        do {
            game(roundTxt);
            roundTxt.addLine("Fine partita " + count);
            System.out.println("#################################################");
            roundTxt.addLine("#################################################");
            System.out.println("""
                               Vuoi rigiocare?
                               1)Si
                               2)No""");
            roundTxt.addLine("""
                               Vuoi rigiocare?
                               1)Si
                               2)No""");
            risposta = scanner.nextInt();
            if (risposta == 1){
                roundTxt.addLine("Sì");
            } else{
                roundTxt.addLine("No");
            }


            count++;
        }while(risposta==1);

        roundTxt.addLine("Uscita dal gioco eseguita con successo");
    }

    public static void game(SalvataggioFile file){
        int numeroComputer = random.nextInt(9) + 1;

        for (int tentativo = 0; tentativo < 3; tentativo++) {
            System.out.println("Scegli un numero da 1 a 9: ");
            int numeroUtente = scanner.nextInt();
            file.addLine("Scegli un numero da 1 a 9: " + numeroUtente + "\n");

            if (numeroUtente == numeroComputer) {
                System.out.println("Hai vinto. Complimenti!!");
                file.addLine("Hai vinto. Complimenti!!\n");
                return;

            } else {
                System.out.println("Non hai indovinato. Ritenta!");
                file.addLine("Non hai indovinato. Ritenta!\n");
            }
        }
        System.out.println("Il pc ha scelto il numero "+ numeroComputer);
        file.addLine("Il pc ha scelto il numero "+ numeroComputer + "\n");

        System.out.println("Hai perso il gioco!\n\n");
        file.addLine("Hai perso il gioco!\n");
    }
}
