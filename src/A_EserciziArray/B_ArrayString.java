package A_EserciziArray;

import java.lang.Math;
import java.util.ArrayList;

public class B_ArrayString {
    public static void main(String[] args) {
        ArrayList<String> coseDaMangiare = new ArrayList<>();

        /* Popolare array*/
        coseDaMangiare.add("Pane");
        coseDaMangiare.add("Pasta");
        coseDaMangiare.add("Carne");
        coseDaMangiare.add("Patate");
        coseDaMangiare.add("Gelato");

        for (int i = 0; i < coseDaMangiare.size(); i++) {
            coseDaMangiare.set(i, coseDaMangiare.get(i).toUpperCase());
        }
        System.out.println(coseDaMangiare);
        for (int i = 0; i < coseDaMangiare.size(); i++) {
            System.out.println(coseDaMangiare.get(i));
        }
    }
}
