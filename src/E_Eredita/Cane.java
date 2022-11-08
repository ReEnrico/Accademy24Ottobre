package E_Eredita;
/*Cane estende animale, cioè è una sottoclasse*/
public class Cane extends Animale{
    private int occhi;
    private int gambe;
    private String pelo;
    /*Costruttori con Superclass fields ALT+INS*/

    public Cane(String nome, int cervello, int corpo, int dimensioni, int peso, int occhi, int gambe, String pelo) {
        super(nome, cervello, corpo, dimensioni, peso);
        this.occhi = occhi;
        this.gambe = gambe;
        this.pelo = pelo;
    }

    private void mastica(){
        System.out.println("Masticane");
    }

    /*3 modi di utilizzo dei metodi delle superclassi
    * invocazione pura del metodo della superclasse
    * override ridefinisco il metodo super rendendolo più specifico
    * inclusion si creano dei metodi specifici che però al loro interno hanno l'invocazione al metodo della superclasse*/

    /*override*/

    @Override//annotation: è il commento alla macchina di ciò che accade
    public void mangia() {
        super.mangia();
        mastica();
    }
    /*inclusion*/
    public void cammina(){
        System.out.println("Cane cammina");
        super.muovi(2);
    }
    public void corri(){
        System.out.println("Cane corre");
        super.muovi(7);
    }
}
