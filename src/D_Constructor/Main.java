package D_Constructor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("""
                Benvenuto nella procedura di creazione di un conto corrente.
                Seguire le indicazioni della procedura guidata""");
        ContoBancario nuovoConto = creaConto();

        System.out.println("Si desidera effettuare altre operazioni? Sì/No");
        Scanner scanner = new Scanner(System.in);
        String risposta = scanner.nextLine();

        if (risposta.equalsIgnoreCase("Sì")){
            altreOperazioni(nuovoConto);
        } else {
            System.out.println("A presto!");
        }

        System.out.println("Numero di conti creati " + ContoBancario.getNumerazioneCreazione());

    }/*end main*/

    private static ContoBancario creaConto(){

        System.out.println("""
                Benvenuto, gentile cliente.
                Nel seguente menù è possibile aprire un nuovo conto.
                Inserisca i suoi dati""");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome e Cognome");
        String nomeIntestatario = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Indirizzo email");
        String emailCliente =  scanner.nextLine();
        scanner.nextLine();

        System.out.println("Numero conto");
        String numeroConto = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Il saldo iniziale, per i centesimi si usi la \",\"");
        double saldoIniziale = scanner.nextDouble();
        scanner.nextLine();

        ContoBancario nuovoConto = new ContoBancario(numeroConto,
                                                     saldoIniziale,
                                                     nomeIntestatario,
                                                     emailCliente);
        return nuovoConto;
    }/*end contobancario con elementi*/

    /*overload metodo creazione*/
   /* private static ContoBancario creaConto(){
        ContoBancario nuovoConto = new ContoBancario();
        return nuovoConto;
    }/*end void contoBancario*/

     private static void altreOperazioni (ContoBancario nuovoConto){
         while (true) {
             System.out.println("""
                    Buongiorno gentile cliente. Selezioni dell'elenco l'operazione che desidera effettuare:
                    1) Aggiornare informazioni
                    2) Visualizzazione informazioni conto esistente
                    3) Deposito denaro
                    4) Ritiro denaro
                    5) Per chiudere""");

             Scanner scanner = new Scanner(System.in);
             try{
                 int numeroOperazione = scanner.nextInt();

                 if (numeroOperazione == 1) {
                     nuovoConto.aggiornaInformazioni();
                 } else if (numeroOperazione == 2) {
                     nuovoConto.visualizza();
                 } else if (numeroOperazione == 3) {
                     nuovoConto.depositaContante();
                 } else if (numeroOperazione == 4) {
                     nuovoConto.ritiroContante();
                 } else if (numeroOperazione == 5) {
                     break;
                 }
             } catch (Exception e) {
                 System.out.println("Caratteri inseriti non validi. Riprovare.");
             }
         }
     }

}
