package G3_LampadinaInterrutore;

enum StatoLampadina{
    ACCESO,
    SPENTO,
    ROTTO
        }

public class Lampadina {

    private StatoLampadina stato;
    private int obsolescenzaProgrammata;


    private static boolean correnteCircuito = true;

    public Lampadina(int obolescenza) {
        this.stato = StatoLampadina.SPENTO;
        this.obsolescenzaProgrammata = obolescenza;
    }

    public StatoLampadina getStato() {
        return stato;
    }

    public void setStato(StatoLampadina stato) {
        this.stato = stato;
    }

    public static void setCorrenteCircuito() {
        Lampadina.correnteCircuito = !correnteCircuito;
    }

    public String stato(){
        if (!correnteCircuito){
            return "Non c'è corrente nel circuito";
        }
        return switch (stato){
            case ACCESO -> "La lampadina è accesa";
            case ROTTO -> "La lampadina è rotta";
            case SPENTO -> "La lampadina è spenta";
        };
    }

    /*public static void clickInterruttoreGenerale (){
        correnteCircuito = !correnteCircuito;
        if (correnteCircuito){
            System.out.println("Interruttore generale acceso");
        } else {
            System.out.println("Interruttore generale spento");
        }
    }*/

    public void click(){
        if (correnteCircuito){
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

