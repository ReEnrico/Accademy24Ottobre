package B_MetodiSemplici;
        /*ESERCIZIO 3
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
        * ________________
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
        * per limitare il numero delle cifre decimali del risultato*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*import java.util.Scanner;

public class G_ConvertitoreImperiale {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double piedi;
        double pollici;


        while (true) {
            try {
                System.out.println("Inserisci piedi");
                piedi = scanner.nextDouble();

                System.out.println("Inserisci pollici");
                pollici = scanner.nextDouble();

                trasponiPiediEPolliciInCentimetri(piedi, pollici);

                System.out.println("Inserisci valore in pollici per sapere quanti piedi e pollici sono e la conversione in cm");
                pollici = scanner.nextDouble();

                trasponiPiediEPolliciInCentimetri(pollici);
            }
            catch (Exception e) {
                System.out.println("Inserisci un valore valido!");
                scanner.nextLine();
            }
        }
    }
    /*end main*/


    /*public static void trasponiPiediEPolliciInCentimetri (double piedi, double pollici) {

        String pattern = "#.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        double piediInCm;
        double polliciInCm;


        if(piedi < 0 || pollici < 0 || pollici > 12) {
            System.out.println("Valore inserito non valido");
            return;
        }
        else
            piediInCm = piedi * 12 * 2.54;
        polliciInCm = pollici * 2.54;

        System.out.println(piedi + " piedi equivalgono a: " + (decimalFormat.format(piediInCm)) + " cm, " + pollici + " pollici equivalgono a: " + (decimalFormat.format(polliciInCm)) + " cm");
        System.out.println("Sei alto: " + (decimalFormat.format(piediInCm + polliciInCm)) + " cm");
    }

    public static void trasponiPiediEPolliciInCentimetri (double pollici) {*/
        /*creo pattern*/
       /* String pattern = "######.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        double piedi = 0;
        double polliciDiResto = 0;

        /*se input non è valido*/
        /*if(pollici < 0 ) {
            System.out.println("Valore inserito non valido");
            return;*/
        //}
        /*se input è valido*/
        /*else {
            /*ricavo l equivalenti in piedi e pollici dei pollici*/
           /* piedi = pollici/12;
            polliciDiResto = pollici%12;
            piedi = Math.floor(piedi);
            /*stampo risultato e chiamo metodo overloadato per calcolare nuovi valori*/
            /*System.out.println(pollici + " pollici equivalgono a: " + (decimalFormat.format(piedi)) + " piedi e " + (decimalFormat.format(polliciDiResto)) + " pollici");
            trasponiPiediEPolliciInCentimetri(piedi, polliciDiResto);*/
/*        }
    }
}
}*/
