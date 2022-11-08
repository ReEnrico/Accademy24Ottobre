package E_Eredita;

public class Main {
    public static void main(String[] args) {
        Cane primoCane = new Cane("Fuffy", 1, 1, 3, 5, 2, 4, "Corto");
        primoCane.mangia();
        primoCane.cammina();
        primoCane.corri();
        Animale animale = new Cane("bau", 1, 1, 34, 43, 2, 4, "lungo");
        animale.muovi(2);

        /*invocazione diretta*/
        primoCane.muovi(12);

        Pesce primoPesce = new Pesce("Nemo", 1, 1, 3, 4, 2, 4, 5);
        primoPesce.nuota(6);
        primoPesce.mangia();
    }
}
