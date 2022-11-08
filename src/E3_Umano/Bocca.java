package E3_Umano;

public class Bocca {

    private int denti;
    private int lingua;
    private int cordeVocali;

    public Bocca(int denti, int lingua, int cordeVocali) {
        this.denti = denti;
        this.lingua = lingua;
        this.cordeVocali = cordeVocali;
    }

    public int getDenti() {
        return denti;
    }

    public int getLingua() {
        return lingua;
    }

    public int getCordeVocali() {
        return cordeVocali;
    }

    public void mangiare(){
        System.out.println("Il cibo è triturato con i denti e grazie alla lingua viene deglutito");
    }

    private void parlare(){
        System.out.println("Le corde vocali assieme alla lingua permettono di parlare");
    }
}
