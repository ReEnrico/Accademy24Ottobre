package I_AbstractClasses;

public class Uomo extends Bipede{

    public Uomo(String nome) {
        super(nome);
        verso = "parla";
    }

    @Override
    public String vive() {
        return super.vive() + " ferma in appartamenti o case";
    }

    @Override
    public String siMuove() {
        return super.siMuove() + " camminando o correndo su due gambe" +
                "";
    }

    @Override
    public String chi_e() {
        return "un uomo";
    }
}
