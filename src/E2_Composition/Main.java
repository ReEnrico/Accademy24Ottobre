package E2_Composition;

public class Main {
    public static void main(String[] args) {
        /*modalità estesa*/
        Dimensioni dimensioni = new Dimensioni(20, 45, 35);
        Case scatola = new Case("Silencio234", "Silencio", "1000W", dimensioni);
        /*modalità shorthand*/
        Monitor schermoPc = new Monitor("amsungOled45", "Samsung",
                                        new Dimensioni(21, 23, 4),
                                        new Risoluzionie(1980, 2545));

        SchedaMadre motherBoard = new SchedaMadre(35, "Asus", 5, "23032");

        Pc primoPc = new Pc(scatola, schermoPc, motherBoard);
        /*chiamata diretta: prende la parte destra della relazione has a*/
        schermoPc.disegnaPixels(23, 45, "verde");
        /*chiamata indiretta prende la parte indiretta della relazione*/
        primoPc.getIlMonitor().disegnaPixels(23, 45, "verde");
    }
}
