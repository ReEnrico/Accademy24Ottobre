package I_AbstractClassWithInterface;

public abstract class Animale {

    private String nome;
    protected String verso;

    public Animale(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract String siMuove();
    public abstract String vive();
    public abstract String chi_e();



    public void visualizza(){
        System.out.printf("%s, %s si muove %s e vive %s\n", this.nome, chi_e(), siMuove(), vive());
    }
}

