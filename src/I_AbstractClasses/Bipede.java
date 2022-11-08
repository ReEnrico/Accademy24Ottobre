package I_AbstractClasses;

public abstract class Bipede extends AnimaleTerrestre{

    public Bipede(String nome) {
        super(nome);
    }

    @Override
    public String siMuove() {
        return " camminando a due zampe";
    }

    @Override
    public String chi_e() {
        return super.chi_e() + " con due zampe o gambe";
    }
}
