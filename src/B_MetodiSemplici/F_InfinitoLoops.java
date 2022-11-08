package B_MetodiSemplici;

import java.util.Scanner;

public class F_InfinitoLoops {
    public static void main(String[] args) {
        prendiValori();
    }/*end main*/

    private static void prendiValori(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un intero fra 1 - 100");
        while (true){
            try{
                int numero = scanner.nextInt();
                if (numero >= 1 && numero <= 100){
                    System.out.println("Hai inserito " + numero);
                    break;
                } else {
                    System.out.println("Errore di inserimento. Serve un numero fa 1 e 100");
                }
            } catch (Exception e){
                System.out.println("Inserire un numero intero");
            } finally {
                scanner.nextLine();
            }
        }
    }/*end prendiValori*/
}
