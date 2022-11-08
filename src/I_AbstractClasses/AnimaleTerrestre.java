package I_AbstractClasses;

public abstract class AnimaleTerrestre extends Animale{

    public AnimaleTerrestre(String nome) {
        super(nome);
    }

    @Override
    public String vive() {
        return "sulla terraferma";
    }

    @Override
    public String chi_e() {
        return " un animale terrestre";
    }
}
