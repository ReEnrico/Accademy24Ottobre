package I_AbstractClasses;

public abstract class AnimaleAcquatico extends Animale{

    public AnimaleAcquatico(String nome) {
        super(nome);
    }

    @Override
    public String vive() {
        return "nell'acqua";
    }

    @Override
    public String chi_e() {
        return "un animale acquatico";
    }
}
