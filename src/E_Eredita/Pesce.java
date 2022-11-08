package E_Eredita;

public class Pesce extends Animale{
    private int branchie;
    private int occhi;
    private int pinne;

    public Pesce(String nome, int cervello, int corpo, int dimensioni, int peso, int branchie, int occhi, int pinne) {
        super(nome, cervello, corpo, dimensioni, peso);
        this.branchie = branchie;
        this.occhi = occhi;
        this.pinne = pinne;
    }

    private void muoviPinne(){
        System.out.println("Il pesce sta muovendo le pinne");
    }

    public void nuota(int velocita){
        super.muovi(velocita);
        muoviPinne();
    }
}
