package L_EsercitazioniVarie;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

enum StatoLampadina{
    ACCESO,
    SPENTO,
    ROTTO
        }

public class Lampadina implements CanStoreInformation{

    private StatoLampadina stato;
    private int obsolescenzaProgrammata;


    public Lampadina() {
        this.stato = StatoLampadina.SPENTO;
        int obolescenza = (int) (Math.random()*40) + 8;
        this.obsolescenzaProgrammata = obolescenza;
    }

    public StatoLampadina getStato() {
        return stato;
    }

    public void setStato(StatoLampadina stato) {
        this.stato = stato;
    }

    @Override
    public void salvaInformazione(String nomeLampadina) {
        try {
            File nuovoFIle = new File("StatoCircuito.txt");

            if (nuovoFIle.createNewFile()){
                System.out.println("Ho creato un file " + nuovoFIle.getName());
            }
        } catch (IOException e){
            System.out.println("Errore nella creazione del file");
            //e.printStackTrace();
        }

        try {
            FileWriter fileWriter = new FileWriter("StatoCircuito.txt", true);//se aggiungo true aggiunge in coda
            fileWriter.write(nomeLampadina + " " + stato() + "\n");

            fileWriter.close();
            //System.out.println("Ho scritto nel file con successo");
        }catch (IOException e){
            System.out.println("Errore scrittura del file");
        }

    }
    public String stato(){
        if (!CircuitoElettrico.isCorrenteCircuito()){
            return "Non c'è corrente nel circuito";
        }
        return switch (stato){
            case ACCESO -> "La lampadina è accesa";
            case ROTTO -> "La lampadina è rotta";
            case SPENTO -> "La lampadina è spenta";
        };
    }


    public void click(){
        if (CircuitoElettrico.isCorrenteCircuito()){
            if (obsolescenzaProgrammata <= 0){
                this.stato = StatoLampadina.ROTTO;
                return;
            }
            switch (this.stato){
                case ACCESO:
                    this.stato = StatoLampadina.SPENTO;
                    break;
                case SPENTO:
                    this.stato = StatoLampadina.ACCESO;
                    break;
                case ROTTO:
                    return;
            }
            this.obsolescenzaProgrammata--;
        }

    }


}

