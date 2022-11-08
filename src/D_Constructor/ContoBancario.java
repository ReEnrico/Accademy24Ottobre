package D_Constructor;

import java.util.Scanner;

public class ContoBancario {
    /*Proprietà*/
    private String numero;
    private double saldo;
    private String nomeCliente;
    private String emailCliente;

    private int numerazioneConti;

    private static int numerazioneCreazione = 0;

    //POJO plain old java project
    /*Costruttori*/
    public ContoBancario(String numero, double saldo, String nomeCliente, String emailCliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;

        numerazioneCreazione++;
        numerazioneConti = numerazioneCreazione;

        System.out.printf("""
                Creazione conto bancario riuscita correttamente:
                - nome cliente %s
                - email cliente %s
                - numero conto %s\n""", this.nomeCliente, this.emailCliente, this.numero);
    }

   /* public ContoBancario(){
        this("00000", 0, "Nome Ignoto", "Email Sconosciuta");
        System.out.println("Il construttore vuoto con valori di default è stato invocato");
    }*/

    /*metodi*/
    public void aggiornaInformazioni(){
        System.out.println("""
                Benvenuto nel menù di cambio informazioni.
                Cosa si vuole cambiare:
                1) Solo il nome
                2) Solo l'email
                3) Sia nome che email.
                4) Per chiudere il menù""");
        Scanner scanner = new Scanner(System.in);
        try {
            int numeroOperazione = scanner.nextInt();
            switch (numeroOperazione){
                case 1:
                    cambiaNome();
                    break;
                case 2:
                    cambiaEmail();
                    break;
                case 3:
                    cambiaNomeEmail();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Operazione selezionata non valida. Riprovare");
                    aggiornaInformazioni();
            }
        } catch (Exception e){
            System.out.println("Operazione non valida. Riprovare");
            aggiornaInformazioni();
        }


    }

    public void cambiaNome(){
        System.out.println("Inserisca il nuovo nome");
        Scanner scanner = new Scanner(System.in);
        this.nomeCliente = scanner.nextLine();
        System.out.println("Nome correttamente modificato. Nuovo nuovo nome: " + this.nomeCliente);
    }
    public void cambiaEmail(){
        System.out.println("Inserisca la nuova email");
        Scanner scanner = new Scanner(System.in);
        this.emailCliente = scanner.nextLine();
        System.out.println("Email correttamente modificata. Nuova email: " + this.emailCliente);
    }
    public void cambiaNomeEmail(){
        System.out.println("Inserisca la nuova email");
        Scanner scanner = new Scanner(System.in);

        this.nomeCliente = scanner.nextLine();
        scanner.nextLine();

        this.emailCliente = scanner.nextLine();
        scanner.nextLine();

        System.out.printf("""
                Informazioni correttamente aggiornati:
                Nome %s
                Email %s\n""", this.nomeCliente, this.emailCliente);
    }


    public void depositaContante(){
        System.out.printf("""
                Benvenuto nel menù di deposito. 
                Si inserisca la cifra da depositare, per indicare i centesimi si utilizzi la \",\".\n""");
        Scanner scanner = new Scanner(System.in);
        double cifra = scanner.nextDouble();
        this.saldo += cifra;
        System.out.format("""
                Al conto numero %s sono stati aggiunti %.2f.
                Saldo contabile: %.2f\n""", this.numero, cifra, this.saldo);
    }

    public void ritiroContante(){
        System.out.printf("""
                Benvenuto nel menù di ritiro. 
                Si inserisca la cifra da depositare, per indicare i centesimi si utilizzi la \",\".\n""");
        Scanner scanner = new Scanner(System.in);
        double cifra = scanner.nextDouble();
        if (this.saldo > cifra){this.saldo -= cifra;
            this.saldo -= cifra;
            System.out.format("""
                Al conto %s sono stati aggiunti %.2f.
                Saldo contabile: %.2f\n""", this.numero, cifra, this.saldo);
        }else {
            System.out.format("Non vi sono abbastanza soldi per questa operazione");
        }

    }

    public void visualizza(){
        System.out.format("""
                L'utente %s (email %s) possiede il conto numero %s.
                Il saldo attuale è %.2f.
                &=&=&=&=&=&=&=&=&=&=&=&=&\n"
                """, this.nomeCliente, this.emailCliente, this.numero, this.saldo);
    }

    public static int getNumerazioneCreazione(){
        return numerazioneCreazione;
    }
}
