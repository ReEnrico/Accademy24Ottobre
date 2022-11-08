package A1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class N_HashMapSorting {
    public static void main(String[] args) {
        /*Ordinare hashmap con TreeMap, permette di ordinare in modo veloce con un'impronta di memorai bassa*/
        HashMap<Integer, String> nomi = new HashMap<>();
        nomi.put(3, "Malenia");
        nomi.put(1, "Ranni");
        nomi.put(2, "Marika");
        Iterator<Integer> iterator = nomi.keySet().iterator();
        System.out.println("Print prima del sort ");
        while (iterator.hasNext()){
            int chiave = (int) iterator.next();
            System.out.println("Chiave " + chiave + ", Valore: " + nomi.get(chiave));
        }
        System.out.println("Print dopo il loop ");
        TreeMap<Integer, String> treeMap = new TreeMap<>(nomi);
        System.out.println(treeMap);

        /*Creo iteratore su TreeMap, treemap può essere ordinato con facilità. L'hashmap necessita lavoro in più*/
        Iterator iteratore = treeMap.keySet().iterator();
        while (iteratore.hasNext()){
            int chiave = (int) iteratore.next();
            System.out.println("Chiave " + chiave + ", Valore: " + nomi.get(chiave));
        }
        System.out.println(nomi);

    }
}
