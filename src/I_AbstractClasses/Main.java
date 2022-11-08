package I_AbstractClasses;

public class Main {
    public static void main(String[] args) {

        PesceDiMare primoPesce = new PesceDiMare("Nemo");
        Piccione primoPiccione = new Piccione("Pidove");
        Uomo primoUomo = new Uomo("Giangianni");
        Cavallo primoCavallo = new Cavallo("Furia");

        primoPesce.visualizza();
        primoPiccione.visualizza();
        primoUomo.visualizza();
        primoCavallo.visualizza();
    }
}
