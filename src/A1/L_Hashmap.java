package A1;

import java.util.HashMap;

public class L_Hashmap {
    public static void main(String[] args) {

        HashMap<String, String> azioni = new HashMap<>();
        /*Inserimento .put()*/
        azioni.put("Ho fame", "Mangio");
        azioni.put("Ho sete", "Bevo");
        azioni.put("Ho sonno", "Dormo");
        azioni.put("Ho caldo", "Mi spoglio");

        System.out.println(azioni);

        System.out.println("Le chiavi sono " + azioni.keySet());

        System.out.println("I valori sono "+ azioni.values());

        /* return di chiavi valori in un set con entrySet()*/
        System.out.println("Key/value " + azioni.entrySet());

        /*get()*/
        System.out.println(azioni.get("Ho fame"));

        /*togliere remove(), serve la chiave*/
        azioni.remove("Ho sonno");
        System.out.println(azioni);

        System.out.println(azioni.size());

        for (String azione: azioni.keySet()) {
            System.out.println(azione);
        }

        for (String azione: azioni.values()) {
            System.out.println(azione);
        }

        for (String azione: azioni.keySet()) {
            System.out.println("Chiave: " + azione + "\nValore: " + azioni.get(azione));
        }

        /*hashmap misto*/
        HashMap<String, Integer> doors = new HashMap<>();
        doors.put("Io", 28);
        doors.put("Guido", 28);
        doors.put("Alex", 18);
        doors.put("Unicormo", 100_000);
        for (String door: doors.keySet()) {
            System.out.println("Individuo: " + door + "\nEtà " + doors.get(door));
        }

        /* Cercare dentro Hashmap: containskey/containsValue. Sono booleani*/
        System.out.println(doors.containsKey("Io"));
        System.out.println(doors.containsValue(100_000));

     }
}
