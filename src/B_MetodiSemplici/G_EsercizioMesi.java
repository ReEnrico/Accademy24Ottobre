package B_MetodiSemplici;

import java.util.HashMap;
import java.util.Scanner;


public class G_EsercizioMesi {
    /*
     *
     * ESERCIZIO 1 stagioni e mesi
     *   creare una nuova casse con nome G_EsercizioMesi
     * Crea un HashMap con chiave numerica e valore nome mese dell'anno
     * (esempio 1 Gennaio, 2 Febbraio ....)
     *
     * Prendi un input dall'utente, che sia un numero da 1 a 12
     * Usate a piacere Scanner o BufferedReader
     * Controlla la validità dell'input.
     *
     * Rispondi all'utente in che stagione siamo in quel mese e che mese ha selezionato
     * "Hai selezionato agosto, siamo in estate"
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        determinaStagione(scanner);

    }/*end main*/

    private static int prendiInput (Scanner scanner){
        if (!scanner.hasNextInt()){
            System.out.println("Okay, basta così :)");
            return -1;
        }
        int numb = scanner.nextInt();
        if (numb > 12){
            System.out.println("A quel numero non corrisponde alcun mese! Riprovi :)");
            scanner.nextLine();
            return prendiInput(scanner);

        } else {
            return numb;
        }
    }/*end prendiInput*/


    public static void determinaStagione(Scanner scanner){

        System.out.println("""
                Salve! Mi dica il numero di un mese (1 - 12) e le dirò in che stagione si trova!
                Scriva Stop per fermare""");
        String[] nomiMesi = {"Gennaio", "Febbraio", "Marzo",
                "Aprile", "Maggio", "Giugno",
                "Luglio", "Agosto", "Settembre",
                "Ottobre", "Novembre", "Dicembre"};

        HashMap<Integer, String> mesiAnno = new HashMap<>();
        for (int i = 0; i < nomiMesi.length; i++) {
            mesiAnno.put(i+1, nomiMesi[i]);
        }

        while (true){
            //System.out.println("entro nel while");
            String stagione = "";

            int numbMese = prendiInput(scanner);
            //System.out.println(numbMese);
            if (numbMese < 0){
                break;
            }

            switch (numbMese){
                case 1 -> stagione = "Inverno";
                case 2 -> stagione = "Inverno";
                case 3 -> stagione = "Primavera";
                case 4 -> stagione = "Primavera";
                case 5 -> stagione = "Primavera";
                case 6 -> stagione = "Estate";
                case 7 -> stagione = "Estate";
                case 8 -> stagione = "Estate";
                case 9 -> stagione = "Autunno";
                case 10 -> stagione = "Autunno";
                case 11 -> stagione = "Autunno";
                case 12 -> stagione = "Inverno";
            }
            System.out.format("Il numero da lei selezionato corrisponde al mese %s" +
                    "; in tale mese siamo in %s", numbMese, stagione);
            System.out.println("\nDi nuovo? Inserisca un numero allora: ");
        }

    }/*end determinaStagione*/
}
