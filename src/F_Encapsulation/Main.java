package F_Encapsulation;

public class Main {
    public static void main(String[] args) {
        /*Questo è il contrario dell'encapsulation*/
        Giocatore giocatore1 = new Giocatore();
        giocatore1.nome = "Orazio";
        giocatore1.salute = 100;
        giocatore1.arma = "spada";

        giocatore1.perditaSalute(45);

        System.out.printf("%s ha %d", giocatore1.nome, giocatore1.salute);

        /*Ora le cose sono protette*/
        GiocatoreIncapsulato giocatore2 = new GiocatoreIncapsulato("Tard", 100, "arco");
        System.out.println(giocatore2);
        giocatore2.visualizza();
        giocatore2.perditaSalute(33);
        //giocatore2.salute = 333; non ho più accesso diretto
        giocatore2.acquistaSalute(56);
    }
}
