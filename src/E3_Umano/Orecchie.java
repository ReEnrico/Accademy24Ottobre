package E3_Umano;

public class Orecchie {

    private int numeroOrecchie;
    private int dimensioniOrecchie;

    public Orecchie(int numeroOrecchie, int dimensioniOrecchie) {
        this.numeroOrecchie = numeroOrecchie;
        this.dimensioniOrecchie = dimensioniOrecchie;
    }

    public int getNumeroOrecchie() {
        return numeroOrecchie;
    }

    public int getDimensioniOrecchie() {
        return dimensioniOrecchie;
    }

    public void ascolto(){
        System.out.println("I suoni sono ascoltati tramite le orecchie");
    }
}
