package I_AbstractClassWithInterface;

import I_AbstractClasses.Animale;
import I_AbstractClasses.Uccello;

public class Piccione extends Uccello implements CanFlyWithRadar, CanLiveInACity{

    public Piccione(String nome) {
        super(nome);
        verso = "tuba";
    }

    @Override
    public String vive() {
        return " sui tetti delle città\n";
    }

    @Override
    public String chi_e() {
        return super.chi_e() + " nello specifico un piccione";
    }


    @Override
    public void volaConRadar() {
        System.out.println("Il piccione è capace di spostarsi in stormi sorvolando i terri delle case");
    }

    @Override
    public void scansaAuto() {
        System.out.println("Il piccione ha imparato la pericolosità delle auto e sa spostarsi");
    }

    @Override
    public void trovaCiboNeiRifiutiUmani() {
        System.out.println("Il piccione ha capito che fra i rifiuti umano può trovare cibo in abbondanza");
    }
}
