package I_AbstractClasses;

public class PesceDiMare extends AnimaleMarino{

    public PesceDiMare(String nome) {
        super(nome);
        verso = "glugluglu";
    }

    @Override
    public String siMuove() {
        return "nuotando come un pesce di mare";
    }

    @Override
    public String chi_e() {
        return super.chi_e() + " ti tipo pesce";
    }
}
