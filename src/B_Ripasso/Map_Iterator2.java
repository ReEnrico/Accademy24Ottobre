package B_Ripasso;

import java.util.HashMap;
import java.util.Map;

public class Map_Iterator2 {
    public static void main(String[] args) {

        HashMap<Integer, Integer> numbPower = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("L'indice è " + i);
            int key = (int) (Math.random()*100);
            if (!numbPower.containsKey(key)){
                int value = (int) Math.pow(key, 2);
                numbPower.put(key, value);
                System.out.println("Aggiunto coppia " + key + " " + value);
            } else {
                System.out.println(key + " è ripetuto, rifaccio");
                i--;
            }
        }
        System.out.println("Lunghezza " + numbPower.keySet().size());

        System.out.println(numbPower);
    }
}
    /*
     *
     * ESERCIZIO 1 stagioni e mesi
     *   creare una nuova casse con nome G_EsercizioMesi
     * Crea un HashMap con chiave numerica e valore nome mese dell'anno
     * (esempio 1 Gennaio, 2 Febbraio ....)
     *
     * Prendi un input dall'utente , che sia un numero da 1 a 12
     * Usate a piacere Scanner o BufferedReader
     * Controlla la validità dell'input
     *
     * Rispondi all'utente in che stagione siamo in quel mese e che mese ha selezionato
     * "Hai selezionato agosto, siamo in estate"
     *
     *
      *
      * Esercizio 2
      * Lo stesso di M_EsercizioMesi
      * però con la data odierna e l'estrazione del mese dalla data di oggi
      *
      *
      * ESERCIZIO 3
       Creare una classe che si chiama G_ConvertitoreImperiale
      * Crea un metodo chiamato trasponiPiediEPolliciInCentimetri
      Deve avere due parametri.
      piedi è il primo parametro, pollici è il secondo parametro
      Controlla che il primo parametro piedi sia >= 0
      Controlla che il secondo parametro pollici sia >=0 e <=12
      Restituisci un errore di inserimento dal metodo se uno dei precedenti non è vero
      Se i parametri sono validi, calcola quanti centimetri
      corrispondono ai valori di piedi e pollici passati a questo metodo e ritorna
      quel valore.
     * ________________
     *
      Crea un secondo metodo con lo stesso nome ma con un solo parametro
      pollici è il parametro
      convalida che sia >=0 e
      Restituisci un errore di inserimento se non è vero
      Se è valido, allora calcola quanti piedi ci stanno in quei pollici
      e se avanzano dei pollici portati dietro anche quelli
      Infine chiama l'altro metodo Overloadato passando i piedi e i pollici corretti
      scritto in modo che possa calcolare correttamente.
      *
      Suggerimenti: usare double per i tipi di dati numerici è una buona idea
      1 pollice = 2,54 cm e un piede = 12 pollici
      *
      * NOTA: potete usare format() e/o DecimalFormat()
      * per limitare il numero delle cifre decimali del risultato
      */
