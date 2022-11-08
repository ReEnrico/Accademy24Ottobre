package A2_RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A1 {
    public static void main(String[] args) {
        /* ricerca attraverso regular expression solo in stringhe però*/
        /*Pattern pattern = Pattern.compile("ogg", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Oggi sono le 10:30 e va tutto bene");
        boolean found = matcher.find();

        if (found) {
            System.out.println("yes :)");
        } else {
            System.out.println("no :(");
        }*/


        /*ne cerca uno dei tre con |
        * $ lo trova solo alla fine
        * caratteresingolo+ trova tutti i pattern in cui c'è quel carattere
        * ^ trova il match solo se è all'inizio*/
        Pattern pattern = Pattern.compile("ogg|mamma|ciao", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Oggi sono le 10:30 e va tutto bene");
        boolean found = matcher.find();

        if (found) {
            System.out.println("yes :)");
        } else {
            System.out.println("no :(");
        }
    }
}
