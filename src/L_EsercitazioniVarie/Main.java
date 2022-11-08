package L_EsercitazioniVarie;

public class Main {
    public static void main(String[] args) {

        CircuitoElettrico circuitoDomestico = new CircuitoElettrico();
        circuitoDomestico.aggiungiLampadina(new Lampadina());
        circuitoDomestico.aggiungiLampadina(new Lampadina());
        circuitoDomestico.aggiungiLampadina(new Lampadina());
        circuitoDomestico.aggiungiLampadina(new Lampadina());
        circuitoDomestico.aggiungiLampadina(new Lampadina());
        circuitoDomestico.aggiungiLampadina(new Lampadina());
        circuitoDomestico.aggiungiLampadina(new Lampadina());

        for (int i = 0; i < 41; i++) {

            if((i+1) % 8 == 0){
                circuitoDomestico.spegniTutto();
            }
            circuitoDomestico.salvaInformazione((i+1) + " CircuitoDiCasa");

            for (int j = 0; j < 5; j++) {
                int numLampadina = (int) (Math.random()*7);
                circuitoDomestico.selezionaLampadina(numLampadina).click();
                circuitoDomestico.selezionaLampadina(numLampadina).salvaInformazione(Integer.toString(numLampadina));
            }
            if (!CircuitoElettrico.isCorrenteCircuito()){
                circuitoDomestico.accendiTutto();
            }
        }
    }
}
