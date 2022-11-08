package B_MetodiSemplici;

import java.util.ArrayList;
import java.util.Scanner;

public class E_SommaMultipla {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        sommaTantiNumeri(scanner, "Quanti numeri vuoi sommare? [Inserire numeri interi]");

    }/*end main*/

    private static void sommaTantiNumeri(Scanner scanner, String domanda) {
        System.out.println(domanda);
        int quantiInput = scanner.nextInt();
        ArrayList<Integer> numeri = new ArrayList<>();
        for (int i = 0; i < quantiInput; i++) {
            numeri.add(prendiInput(scanner, "Inserisci numero: "));
        }
        int risultato = 0;
        String elencoNumeri = "";
        for (int numero: numeri) {
            risultato += numero;
            elencoNumeri += numero + " ";
        }
        System.out.println("La somma di " + elencoNumeri + " è " + risultato);
    }

    private static int prendiInput(Scanner scanner, String domanda) {
        System.out.println(domanda);
        return scanner.nextInt();
    }
}
