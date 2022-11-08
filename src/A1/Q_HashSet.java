package A1;

import java.util.HashSet;

public class Q_HashSet {
    public static void main(String[] args) {
        /*Come hashmap ma unique*/
        HashSet<String> beatles = new HashSet<>();
        beatles.add("John");
        beatles.add("John1");
        beatles.add("John2");
        beatles.add("John3");
        beatles.add("John3");
        beatles.add("John1");
        /*Ammette valori duplicati ma conta una volta solo elementi dupplicati*/
        System.out.println(beatles);
    }
}
