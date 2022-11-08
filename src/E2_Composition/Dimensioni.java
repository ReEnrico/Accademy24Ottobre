package E2_Composition;

public class Dimensioni {
    private int altezza;
    private int larghezza;
    private int profondità;

    public Dimensioni(int altezza, int larghezza, int profondità) {
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.profondità = profondità;
    }

    public int getAltezza() {
        return altezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public int getProfondità() {
        return profondità;
    }
}
