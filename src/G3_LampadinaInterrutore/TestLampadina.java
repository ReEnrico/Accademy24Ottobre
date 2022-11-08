package G3_LampadinaInterrutore;


import java.util.Scanner;

public class TestLampadina {

    private static Scanner scanner;

    public static void main(String[] args) {

        System.out.println("Inserire un numero intero");
        scanner = new Scanner(System.in);
        int numeroClick = scanner.nextInt();

        Lampadina lampadina1 = new Lampadina(numeroClick);
        Lampadina lampadina2 = new Lampadina(numeroClick);
        Lampadina lampadina3 = new Lampadina(numeroClick);
        Lampadina lampadina4 = new Lampadina(numeroClick);
        Lampadina lampadina5 = new Lampadina(numeroClick);

        CircuitoElettrico circuitoCasa = new CircuitoElettrico();
        circuitoCasa.aggiungiLampadina(lampadina1);
        circuitoCasa.aggiungiLampadina(lampadina2);
        circuitoCasa.aggiungiLampadina(lampadina3);
        circuitoCasa.aggiungiLampadina(lampadina4);
        circuitoCasa.aggiungiLampadina(lampadina5);


        programma:
        while (true) {
            System.out.println("""
                    Che operazione vuoi fare:
                    1) Verifica stato
                    2) Fai click
                    3) Spegni l'impianto
                    4) Accendi l'impianto
                    5) Esci""");
            int operazione;
            try {
                operazione = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Inserire un numero fra 1 e 5");
                scanner.nextLine();
                continue;
            }
            switch (operazione) {
                case 1:
                    System.out.println(lampadina1.stato());
                    System.out.println(lampadina2.stato());
                    System.out.println(lampadina3.stato());
                    System.out.println(lampadina4.stato());
                    System.out.println(lampadina5.stato());
                    break;
                case 2:
                    lampadina1.click();
                    lampadina2.click();
                    lampadina3.click();
                    lampadina4.click();
                    lampadina5.click();
                    break;
                case 3:
                    circuitoCasa.spegniTutto();
                    break;
                case 4:
                    circuitoCasa.accendiTutto();
                    break;
                case 5:
                    break programma;
                default:
                    System.out.println("Inserire un numero fra 1 e 5");
            }

        }
    }
}
