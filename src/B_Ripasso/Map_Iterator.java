package B_Ripasso;

import java.util.HashMap;

public class Map_Iterator {
    public static void main(String[] args) {

        /* HashMap (e affini) e il sorting con Iterator sono poco chiari,
        * quindi ci gioco un po' per capirli meglio*/
        /* Provo il metodo di mettere la dichiarazione di tutte le variabili
        * all'inizio e le inizializzazioni dopo*/

        /* le key sono interi generati casualmente
         * i value sono la potenza delle key
         * voglio un hashmap disordinato da riordinare.
         * Domanda principale: posso agire sull'hashmap con i suoi metodi (.get() ecc )
         * durante il processo di riempimento stesso?*/

        HashMap<Integer, Integer> numbPower = new HashMap<>();//oggetto principale di lavoro

        /* aggiungo elementi*/
        //int counter = 0;
        for (int j = 0; j < 10; j++) {

            for (int i = 0; i < 20; i++) {
            //System.out.println("L'indice è " + i);
                int key = (int) (Math.random()*0) + 1;
                if (!numbPower.containsKey(key)){
                 int value = key*key;
                 numbPower.put(key, value);
                    //System.out.println("Aggiunto coppia " + key + " " + value);
                //counter = 0;
                } else {
                /*la mia idea funziona, il controllo posso farlo
                * ma così mi toglie l'elemento*/
                //System.out.println(key + " è ripetuto, rifaccio.\n Ripetizione #" + counter + " per l'indice " + i);
                //counter++;
                 i--;
                }
             }
        }
        //System.out.println("Lunghezza " + numbPower.keySet().size());
        /*Non capisco perché sia perfettamente ordinata
        * keys are ordered by their insertion order*/
        System.out.println(numbPower);

        /*HashMap<Integer, Integer> corta = new HashMap<>();
        corta.put(33, 0);
        corta.put(11, 1);
        corta.put(2, 2);
        corta.put(60, 3);*/
        //System.out.println(corta);

    }

}
