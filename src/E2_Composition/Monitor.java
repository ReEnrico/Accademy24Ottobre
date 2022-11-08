package E2_Composition;

public class Monitor {
    private String modello;
    private String marca;
    private Dimensioni dimensioni;
    private Risoluzionie risoluzionieNativa;

    public Monitor(String modello, String marca, Dimensioni dimensioni, Risoluzionie risoluzionieNativa) {
        this.modello = modello;
        this.marca = marca;
        this.dimensioni = dimensioni;
        this.risoluzionieNativa = risoluzionieNativa;
    }

    public String getModello() {
        return modello;
    }

    public String getMarca() {
        return marca;
    }

    public Dimensioni getDimensioni() {
        return dimensioni;
    }

    public Risoluzionie getRisoluzionieNativa() {
        return risoluzionieNativa;
    }

    public void disegnaPixels(int x, int y, String colore){
        System.out.printf("Sto disegnando un pixel alle coordinate %d, %d con colore %s\n", x, y, colore);
    }
}
