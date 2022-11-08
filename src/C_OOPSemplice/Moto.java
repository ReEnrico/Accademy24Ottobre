package C_OOPSemplice;

public class Moto {
    /* Creare classe: proprietà e metodi*/
    /*Proprietà */
    private int cilindrata;

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public int getNumeroRuote() {
        return numeroRuote;
    }

    public void setNumeroRuote(int numeroRuote) {
        this.numeroRuote = numeroRuote;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public Moto(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public int numeroRuote;
    private String marca;
    private String modello;

    @Override
    public String toString() {
        return "Moto{" +
                "cilindrata=" + cilindrata +
                ", numeroRuote=" + numeroRuote +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                '}';
    }
}
