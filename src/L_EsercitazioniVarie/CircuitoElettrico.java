package L_EsercitazioniVarie;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class CircuitoElettrico implements CanStoreInformation{

    private LinkedList<Lampadina> circuitoDomestico;

    private static boolean correnteCircuito = true;
    //private static int numeroCircuiti;

    public CircuitoElettrico() {
        this.circuitoDomestico = new LinkedList<>();
        //numeroCircuiti++;
    }

    public static boolean isCorrenteCircuito() {
        return correnteCircuito;
    }

    public static void setCorrenteCircuito() {
        correnteCircuito = !correnteCircuito;
    }

    public void aggiungiLampadina(Lampadina lampadina){
        this.circuitoDomestico.add(lampadina);
    }

    public int dimensioniCircuiti(){
        return this.circuitoDomestico.size();
    }

    public Lampadina selezionaLampadina(int numero){
        return this.circuitoDomestico.get(numero);
    }


    public void accendiTutto(){
        setCorrenteCircuito();
    }

    public void spegniTutto(){
        setCorrenteCircuito();
        for (Lampadina lampadina: this.circuitoDomestico) {
            if (lampadina.getStato() != StatoLampadina.ROTTO){
                lampadina.setStato(StatoLampadina.SPENTO);
            }
        }
    }

    @Override
    public void salvaInformazione(String nomeCircuito) {
        try {
            File nuovoFIle = new File("StatoCircuito.txt");

            if (nuovoFIle.createNewFile()){
                System.out.println("Ho creato un file " + nuovoFIle.getName());
            }
        } catch (IOException e){
            System.out.println("Errore nella creazione del file");
            //e.printStackTrace();
        }
        String stato;
        try {
            FileWriter fileWriter = new FileWriter("StatoCircuito.txt", true);//se aggiungo true aggiunge in coda
            if (correnteCircuito){
                stato = " Corrente on";
            } else {
                stato = " Corrente off";
            }
            fileWriter.write("========================\n" + nomeCircuito + stato + "\n");

            fileWriter.close();
            System.out.println("Ho scritto nel file con successo");
        }catch (IOException e){
            System.out.println("Errore scrittura del file");
        }
    }
}
