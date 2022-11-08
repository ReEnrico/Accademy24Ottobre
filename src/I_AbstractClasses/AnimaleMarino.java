package I_AbstractClasses;

public abstract class AnimaleMarino extends AnimaleAcquatico{

    public AnimaleMarino(String nome) {
        super(nome);
    }

    @Override
    public String vive() {
        return super.vive() + " del mare";
    }

    @Override
    public String chi_e() {
        return super.chi_e() + " marino";
    }
}
