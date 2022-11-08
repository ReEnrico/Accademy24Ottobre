package B_MetodiSemplici;

import java.util.Scanner;

public class B_MetodiConScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double primoInput = prendiInput(scanner, "Inserisci primo numero");
        double secondoInput = prendiInput(scanner, "Inserisci secondo numero");

        double risultato = primoInput + secondoInput;
        System.out.println(risultato);
    }/*end main*/

    private static double prendiInput(Scanner scanner, String domanda){
        System.out.println(domanda);
        return scanner.nextDouble();
    }
}
