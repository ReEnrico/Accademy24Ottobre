package G2_EsercitazioniVarie;



public class Main {
    public static void main(String[] args) {

        Università unipv = new Università();
        unipv.aggiungiDocente(new Docenti("Mario", "Rossi", 2304, 56));
        unipv.aggiungiDocente(new Docenti("Luigi", "Verdi", 6666, 38));
        unipv.aggiungiDocente(new Docenti("Wario", "Gialli", 4032, 65));
        unipv.aggiungiDocente(new Docenti("Peach", "Toadstool", 0001, 20));
        unipv.aggiungiDocente(new Docenti("Daisy", "Unknow", 0001, 20));
        unipv.aggiungiDocente(new Docenti("Luigia", "Di Maria", 55555, 30));

        for (String cognome: unipv.trovaGiovani()) {
            System.out.println(cognome);
        }
    }
}
