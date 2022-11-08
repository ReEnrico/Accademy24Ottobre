package F2_Static;

public class Main {
    public static void main(String[] args) {

        Anagrafe untenteUno = new Anagrafe("Mario", "Rossi", "11/11/2011");
        Anagrafe untenteDue = new Anagrafe("Claudio", "Rossi", "11/02/2001");
        Anagrafe untenteTre = new Anagrafe("Renata", "Rossi", "11/02/2006");
        untenteUno.visualizza();
        untenteDue.visualizza();
        untenteTre.visualizza();
        System.out.println(Anagrafe.getNumeroProgressimo());

    }
}
