package A1;

import java.util.Hashtable;
import java.util.Map;

public class R_HashTable {
    public static void main(String[] args) {
        /* è un hashmap con differenze tecniche di terminologia: ammatte null, è sincronizzata quindi scorre
        * su thread che lavorano insieme.
        * Però è LENTISSIMO, serve solo per app multiprocesso*/
        Hashtable<Integer, String> persone= new Hashtable<>();
        persone.put(3, "mamma");
        persone.put(32, "ninna");
        persone.put(424, "mamma");
        persone.put(44, "mamma");
        persone.put(4, "nonna");

        for (Map.Entry persona : persone.entrySet()){
            System.out.println(persona.getKey() + " " + persona.getValue());
        }

        persone.remove(3);
        System.out.println(persone.get(44));
        System.out.println(persone.getOrDefault(44, "Oggetto non trovato"));
        /*inserire se non già presente (controllalo meglio)*/
        persone.putIfAbsent(222, "halla");
        persone.putIfAbsent(44, "hotel");
        System.out.println(persone);

        /*cercare cose*/
        System.out.println(persone.containsKey(3));
        System.out.println(persone.containsValue("mamma"));

        persone.replace(32, "Arraarra");
        System.out.println(persone);

        /**/
        String[] nomi = {"Carlo", "Aldo", "Giovanni", "Luciano", "Giacomo", "Alessandro"};

        /*Hashtable<String, Integer> tabellaNomi = new Hashtable<>();
        for (String nome: nomi) {
            tabellaNomi;
        }*/

    }
}
