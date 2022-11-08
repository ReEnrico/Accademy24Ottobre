package I_AbstractClasses;

public class Cavallo extends Quadrupede{

    public Cavallo(String nome) {
        super(nome);
        verso = "nitrisce";
    }

    @Override
    public String chi_e() {
        return super.chi_e() + " di tipo cavallo";
    }
}
