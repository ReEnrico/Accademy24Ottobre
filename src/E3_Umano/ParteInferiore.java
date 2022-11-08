package E3_Umano;

public class ParteInferiore {

    private int numeroGambe;
    private int numeroPiedi;

    public ParteInferiore(int numeroGambe, int numeroPiedi) {
        this.numeroGambe = numeroGambe;
        this.numeroPiedi = numeroPiedi;
    }

    public int getNumeroGambe() {
        return numeroGambe;
    }

    public int getNumeroPiedi() {
        return numeroPiedi;
    }

    public void velocitaCorsa(int velocita){
        System.out.printf("Con le gambe si corre a velocità %d", velocita);
    }
}
