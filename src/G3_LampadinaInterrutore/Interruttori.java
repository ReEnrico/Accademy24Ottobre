package G3_LampadinaInterrutore;

public class Interruttori {

    private Lampadina lampadina;

    public Interruttori(Lampadina lampadina) {
        this.lampadina = lampadina;
    }

    public void accensioneSpegimento(){
        this.lampadina.click();
    }
}
