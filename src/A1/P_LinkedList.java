package A1;

import java.util.LinkedList;

public class P_LinkedList {
    public static void main(String[] args) {
        /*è un array list fondamentalmente
        * ArrayList si usa per salvare e acceder ai dai
        * LInkedList si usa per manipolare i dati
        * Il secondo è più veloce e affidabile per quanto riguarda la manipolazione
        * Il primo serve come magazzino, quando mi serve lo riesumo a patto che non debbano cambiare.
        * A livello di gestione di memoria l'array crea un blocco di memoria nuovo ogni volta che aggiungo un elemento.
        * la linked non ha un blocco unico ma tutti i blocchetti ricordano solo i due vicini e quando si aggiunge un elemento,
        * vengono aggiornati solo i due vicini al punto dell'inserimento, gli altri no. Il risultato è maggior velocità*/
        LinkedList<String> oggetti = new LinkedList<>();
        oggetti.add("monitor");
        oggetti.add("pc");
        oggetti.add("cucina");
        oggetti.add("frigo");
        oggetti.add("muose");

        oggetti.set(2, "tappetino");
        System.out.println(oggetti);
        /*ora metodi tipici di linklinst*/
        oggetti.addFirst("piuma");
        oggetti.addLast("orologio");
        System.out.println(oggetti.getFirst());
        System.out.println(oggetti.getLast());
        /*removeFirst e remuoveLast*/
        oggetti.removeFirstOccurrence("cucina");
        oggetti.removeLastOccurrence("muose");
    }
}
