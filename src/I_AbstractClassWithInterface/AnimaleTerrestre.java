package I_AbstractClassWithInterface;

import I_AbstractClasses.Animale;

public abstract class AnimaleTerrestre extends Animale {

    public AnimaleTerrestre(String nome) {
        super(nome);
    }

    @Override
    public String vive() {
        return "sulla terraferma";
    }

    @Override
    public String chi_e() {
        return "un animale terrestre";
    }
}
