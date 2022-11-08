package A1;

import java.util.ArrayList;

public class I_ArrayList {
    public static void main(String[] args) {

        /* Si tratta di un array modificabile in dimensioni
        * Non ammettono variabili primitive al suo interno*/
        ArrayList<String> coseDaMangiare = new ArrayList<>();

        /* Popolare con metodo questa volta*/
        coseDaMangiare.add("Pane");
        coseDaMangiare.add("Pasta");
        coseDaMangiare.add("Carne");
        coseDaMangiare.add("Patate");
        coseDaMangiare.add("Gelato");
        /* Row print*/
        System.out.println(coseDaMangiare);

        /* Si può decidere l'indice in cui inserire, questo è un set: specifica l'identificativo e il valore*/
        coseDaMangiare.add(3, "Fragole");
        System.out.println(coseDaMangiare);

        /* Stampa di un elemento specifico, azione di get*/
        System.out.println(coseDaMangiare.get(2));

        /* Rimuovere*/
        coseDaMangiare.remove(1);
        System.out.println(coseDaMangiare);

        /* traversing with loop*/
        System.out.println("Elenco delle cose che si mangerà domani (traversing with for)");
        for (int i = 0; i < coseDaMangiare.size(); i++) {

            System.out.println((i+1) + ")" + coseDaMangiare.get(i));
        }
        /* foreach*/
        for (String cosaDamangiare: coseDaMangiare) {
            System.out.println(cosaDamangiare);
        }
        ArrayList<Integer> numbers = new ArrayList<>(7);
        for (int i = 0; i < 7; i++) {
            numbers.add(i + 2);
        }
        System.out.println(numbers);
    }
}
