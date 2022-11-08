package I_AbstractClasses;

public abstract class Quadrupede extends AnimaleTerrestre{

    public Quadrupede(String nome) {
        super(nome);
    }

    @Override
    public String siMuove() {
        return " camminando a quattro zampe";
    }

    @Override
    public String chi_e() {
        return super.chi_e() + " con quattro zampe";
    }
}
