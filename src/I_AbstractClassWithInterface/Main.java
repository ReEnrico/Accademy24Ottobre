package I_AbstractClassWithInterface;

public class Main {
    public static void main(String[] args) {

        Piccione piccioneUNo = new Piccione("Pidgy");

        piccioneUNo.visualizza();
        piccioneUNo.scansaAuto();
        piccioneUNo.volaConRadar();
        piccioneUNo.trovaCiboNeiRifiutiUmani();


        Gatto gattoUno = new Gatto("Persian");

        gattoUno.visualizza();
        gattoUno.chiedereDiUscire();
        gattoUno.chiedereDaMangiare();
        gattoUno.cercareCaldoFreddo();
        gattoUno.cercarePostoPerDormire();
    }
}
