package A1;

import java.util.*;

public class M_Iterators {
    public static void main(String[] args) {
        /* Un oggetto che è usato per loopare dentro una collezione
        * funzione da memoria intermedia, impronta di memoria più bassa
        * oggetti pochi sulla trentina*/

        ArrayList<String> coseDaMangiare = new ArrayList<>();

        /* Popolare con metodo questa volta*/
        coseDaMangiare.add("Pane");
        coseDaMangiare.add("Pasta");
        coseDaMangiare.add("Carne");
        coseDaMangiare.add("Patate");
        coseDaMangiare.add("Gelato");

        /*Creo iteratore sulla base di array list*/
        Iterator iterator = coseDaMangiare.iterator();
        //System.out.println(iterator);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        /*Map e Hashmap
        * creaiamo hashmap
        * Map è un interfaccia (rulebooks)
        * Map.Entry è una sorta di iteratore per le hashmap*/
        Map<String, String> nomePersone = new HashMap<>();
        nomePersone.put("A", "IO");
        nomePersone.put("B", "Guido");
        nomePersone.put("C", "Alex");
        nomePersone.put("D", "Jessica");
        for (Map.Entry<String, String> set : nomePersone.entrySet()){
            System.out.println(set.getKey()+ " " + set.getValue());
        }
        /*Il ruolo dei iterator è quello di modificiare l'oggetto su cui si basa senza veramente modificarlo
        * è una copia non cascade. Inoltre accelera il lavoro*/

        List list = new ArrayList<>();
        list.add(1);
        list.add(11);
        list.add(111);
        list.add(1111);
        /*List iterator per muoversi lungo la lista in entrambe le direzioni*/
        ListIterator listIterator = list.listIterator();
        /*System.out.println("Attreversiamo la lista in direzione avanti");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }*/
        /*Non possiamo però a partire dalla fine se però prima non ci siamo arrivati
        * a meno che non mettiamo all'iterator .listIterator(list.size())*/
        System.out.println("Attreversiamo la lista in direzione contraria");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
