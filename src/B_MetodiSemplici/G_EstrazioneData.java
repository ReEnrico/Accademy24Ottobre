package B_MetodiSemplici;

        /* Esercizio 2
        * Lo stesso di M_EsercizioMesi
        * però con la data odierna e l'estrazione del mese dalla data di oggi*/

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;

public class G_EstrazioneData {
    public static void main(String[] args) {

        //System.out.println(getMonth());
        printSeason();

    }/*end main*/

    private static int getMonth(){

        LocalDate today = LocalDate.now();
        return today.getMonthValue();
    }/*end getMonth*/

    private static void printSeason () {

        /*String[] nomiMesi = {"Gennaio", "Febbraio", "Marzo",
                             "Aprile", "Maggio", "Giugno",
                             "Luglio", "Agosto", "Settembre",
                             "Ottobre", "Novembre", "Dicembre"};

        HashMap<Integer, String> mesiAnno = new HashMap<>();
        for (int i = 0; i < nomiMesi.length; i++) {
            mesiAnno.put(i+1, nomiMesi[i]);
        }*/
        String stagione = "";
        switch (getMonth()){
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
        System.out.println(stagione);
    }

}
