package G3_LampadinaInterrutore;

import java.util.LinkedList;

public class CircuitoElettrico {

    private LinkedList<Lampadina> circuitoDomestico;

    public CircuitoElettrico() {
        this.circuitoDomestico = new LinkedList<>();
    }

    public void aggiungiLampadina(Lampadina lampadina){
        this.circuitoDomestico.add(lampadina);
    }


    public void accendiTutto(){
        Lampadina.setCorrenteCircuito();
    }

    public void spegniTutto(){
        Lampadina.setCorrenteCircuito();
        for (Lampadina lampadina: this.circuitoDomestico) {
            if (lampadina.getStato() != StatoLampadina.ROTTO){
                lampadina.setStato(StatoLampadina.SPENTO);
            }
        }
    }
}
