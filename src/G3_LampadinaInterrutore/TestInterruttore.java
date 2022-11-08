package G3_LampadinaInterrutore;


import java.util.Scanner;

public class TestInterruttore {

    private static Scanner scanner = new Scanner(System.in);
    private static Lampadina lampadina1 = new Lampadina(4);


    public static void main(String[] args) {

        Interruttori button1 = new Interruttori(lampadina1);
        Interruttori button2 = new Interruttori(lampadina1);

        programma:
        while (true){
            System.out.println("""
                    Che operazione vuoi fare:
                    1) Verifica stato lampadina
                    2) Usa interruttore 1
                    3) Usa interruttore 2
                    4) Esci""");
            int operazione = scanner.nextInt();

            switch (operazione){
                case 1:
                    System.out.println(lampadina1.stato());
                    break;
                case 2:
                    button1.accensioneSpegimento();
                    break;
                case 3:
                    button2.accensioneSpegimento();
                    break;
                case 4:
                    break programma;
            }

        }
    }

}
