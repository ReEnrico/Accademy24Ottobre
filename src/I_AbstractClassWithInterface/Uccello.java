package I_AbstractClassWithInterface;

import I_AbstractClasses.AnimaleTerrestre;

public abstract class Uccello extends AnimaleTerrestre {

    public Uccello(String nome) {
        super(nome);
        verso = "canta";
    }

    @Override
    public String siMuove() {
        return " volando";
    }

    @Override
    public String vive() {
        return super.vive() + " e sopra un albero";
    }

    @Override
    public String chi_e() {
        return super.chi_e() + " di tipo volatile";
    }
}
