package A2_RegEx;

import java.util.LinkedList;
import java.util.StringTokenizer;
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
        System.out.println(f(15));
        System.out.println("1307674368000");

       /* String time = "Oggi:caldo";
        String[] splitted = time.split(":");
        System.out.println(splitted[0]);
        int ore = Integer.parseInt("03");
        System.out.println(ore);*/
            /*ne cerca uno dei tre con |
        * $ lo trova solo alla fine
        * caratteresingolo+ trova tutti i pattern in cui c'è quel carattere
        * ^ trova il match solo se è all'inizio*/
        /*Pattern pattern = Pattern.compile("ogg|mamma|ciao", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Oggi sono le 10:30 e va tutto bene");
        boolean found = matcher.find();

        if (found) {
            System.out.println("yes :)");
        } else {
            System.out.println("no :(");
        }*/
    }
    public static String f(long n){
        if (n < 1){
            return "1";
        } else {
            return String.valueOf( n * Long.parseLong(f(n-1)));
        }
    }
}
