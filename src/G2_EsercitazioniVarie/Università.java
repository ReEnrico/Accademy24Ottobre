package G2_EsercitazioniVarie;

import java.util.LinkedList;

public class Università {

    private LinkedList<Docenti> docenti;


    public Università() {
        this.docenti = new LinkedList<Docenti>();
    }

    public void aggiungiDocente (Docenti docente){
        this.docenti.add(docente);
    }

    public int etaMinima (){
        int eta = Integer.MAX_VALUE;
        for (Docenti docente: this.docenti) {
            if (docente.getEta() < eta){
                eta = docente.getEta();
            }
        }
        return eta;
    }

    public LinkedList<String> trovaGiovani (){
        LinkedList<String> giovaniDocenti = new LinkedList<String>();
        int etaMinima = etaMinima();
        for (Docenti docente: this.docenti) {
            if (docente.getEta() == etaMinima){
                giovaniDocenti.add(docente.getCognome());
            }
        }
        return giovaniDocenti;
    }




}
