package G2_EsercitazioniVarie;

/*2)Scrivere una classe Docente che rappresenti le seguenti informazioni relative ad un docente: nome,
    cognome, codice ed età, e che contenga il costruttore parametrizzato ed i metodi getCodice, getCognome e
    getEta che restituiscono rispettivamente il codice, il cognome e l’età del docente.
    Scrivere poi una classe Universita, che rappresenti un insieme di docenti universitari tramite un array di tipo
    Docente, e che contenga il costruttore parametrizzato ed un metodo etaMinima che restituisce la minima
    età tra i docenti universitari.
    Inserire nella classe Universita il metodo TrovaGiovani che restituisca i cognomi dei docenti che hanno età minima.
    Esercitazione statica (no interazione con l'utente)*/

public class Docenti {

    private String nome;
    private String cognome;
    private int codice;
    private int eta;

    public Docenti(String nome, String cognome, int codice, int età) {
        this.nome = nome;
        this.cognome = cognome;
        this.codice = codice;
        this.eta = età;
    }


    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getCodice() {
        return codice;
    }

    public int getEta() {
        return eta;
    }
}
