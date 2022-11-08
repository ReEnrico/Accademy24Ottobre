package B_MetodiSemplici;

import java.util.ArrayList;
import java.util.Scanner;

public class G_LoopInfinitiRicorsivi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        sommaMultipla(scanner);

    }/*end main*/

    private static int prendiInput(Scanner scanner, String domanda){
        System.out.println(domanda);
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("inserire intero");
            scanner.nextLine();
            return prendiInput(scanner, domanda);
        }
    }/*end prendiValori*/

    private static void sommaMultipla(Scanner scanner){
        int quantitaInput = prendiInput(scanner, "Quanti numeri vuoi sommare? Minimo due");
        if (quantitaInput < 2){
            System.out.println("Non posso sommare meno di due numeri");
            quantitaInput = prendiInput(scanner, "Quanti numeri vuoi sommare? Solo interi");
        }
        ArrayList<Integer> numeri = new ArrayList<>();
        for (int i = 0; i < quantitaInput; i++) {
            numeri.add(prendiInput(scanner, "Inserisci il " + (i+1) + "°"));
        }
        int risultato = 0;
        String elencoNumeri = "";
        for (int numero: numeri) {
            risultato += numero;
            elencoNumeri += numero + " ";
        }
        System.out.println("La somma di " + elencoNumeri + " è " + risultato);
    }
}
