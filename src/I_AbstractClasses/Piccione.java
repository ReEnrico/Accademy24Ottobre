package I_AbstractClasses;

public class Piccione extends Uccello{

    public Piccione(String nome) {
        super(nome);
        verso = "tuba";
    }

    @Override
    public String vive() {
        return " sui tetti delle città";
    }

    @Override
    public String chi_e() {
        return super.chi_e() + " nello specifico un piccione";
    }
}
