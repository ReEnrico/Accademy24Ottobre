package E_Eredita;
/*Super class generica
* non sempre serve istanziare le super classi*/
public class Animale {
    private String nome;
    private int cervello;
    private int corpo;
    private int dimensioni;
    private int peso;

    public Animale(String nome, int cervello, int corpo, int dimensioni, int peso) {
        this.nome = nome;
        this.cervello = cervello;
        this.corpo = corpo;
        this.dimensioni = dimensioni;
        this.peso = peso;
    }

    public void mangia (){
        System.out.println("Animale.mangia è stato invocato");
    }

    public void muovi (int velocita){
        System.out.format("L'animale si muove con velocità %d", velocita);
    }
}
