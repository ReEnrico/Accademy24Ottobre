package I_AbstractClassWithInterface;

import I_AbstractClasses.Quadrupede;

public class Gatto extends Quadrupede implements CanLiveInside, CanInterractWithUman {

    public Gatto(String nome) {
        super(nome);
        verso = "miagola";
    }

    @Override
    public void visualizza() {
        System.out.printf("Persian è %s che vive %s. Passa le giornate spostandosi %s\n",
                            chi_e(), vive(), siMuove());;
    }

    @Override
    public String vive() {
        return "in casa con i suoi umani";
    }

    @Override
    public String siMuove() {
        return "dentro e fuori casa a suo piacimento";
    }

    @Override
    public String chi_e() {
        return "un gattone pasciuto";
    }

    @Override
    public void chiedereDaMangiare() {
        System.out.println("Il gatto ha imparato che disturbando gli umani riceve cibo");
    }

    @Override
    public void chiedereDiUscire() {
        System.out.println("Il gatto ha imparato che mettendosi a graffiare la porta di ingresso, essa si apre");
    }

    @Override
    public void cercareCaldoFreddo() {
        System.out.println("Il gatto sa sempre dove mettersi per poter stare bene indipendentemente dalla temperatura esterna");
    }

    @Override
    public void cercarePostoPerDormire() {
        System.out.println("Il gatto ha i suoi posti strategici per mettersi a dormire");
    }
}
