package A1;

import java.util.Scanner;

public class F_CalcolatriceSemplice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il primo numero");
        var primoNumero = scanner.nextDouble();

        System.out.println("Inserisci il secondo numero");
        var secondoNumero = scanner.nextDouble();

        System.out.println("""
                           Scegli l'operazione: 
                           1 -> somma; 
                           2 -> differenza;
                           3 -> prodotto;
                           4 -> divisione""");
        int operazione = scanner.nextInt();

        switch (operazione){
            case 1:
                System.out.println(primoNumero + secondoNumero);
                break;
            case 2:
                System.out.println(primoNumero - secondoNumero);
                break;
            case 3:
                System.out.println(primoNumero * secondoNumero);
                break;
            case 4:
                if (secondoNumero != 0) {
                System.out.println(primoNumero / secondoNumero);
            } else {
                    System.out.println("Divisione per zero, un calcolatore non riesce a concepire l'infinito");
                }
            default:
                System.out.println("Nessuna operazione valida");
        }
        /* Rimane il problema che in input non riesco a far prendere non int come numeri
        * Inserire controllo sulla divisione non con zero*/
    }
}