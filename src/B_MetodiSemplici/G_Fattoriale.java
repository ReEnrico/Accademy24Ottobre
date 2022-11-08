package B_MetodiSemplici;

import java.util.Scanner;

public class G_Fattoriale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        System.out.println(calcoloFattoriale(numero));
    }/*end main*/

    private static int calcoloFattoriale(int numero) {
       if (numero > 0) {
            return numero * calcoloFattoriale(numero - 1);
        } else {
           return 1;
       }
    }
}