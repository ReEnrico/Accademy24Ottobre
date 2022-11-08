package ZooVirtuale;

public class AnimaleZoo {

    private String nome;
    private int arti;
    private int coda;
    private int occhi;
    private int orecchie;

    public AnimaleZoo(String nome, int arti, int coda, int occhi, int orecchie) {
        this.nome = nome;
        this.arti = arti;
        this.coda = coda;
        this.occhi = occhi;
        this.orecchie = orecchie;
    }/*costruttore*/
    public AnimaleZoo() {}

    public void movimento(){
        int velocità = (int) (Math.random()*10);
        System.out.format("%s si muove con velocità %d.\n", this.nome, velocità);
    }

    public void mangiare(){
        System.out.format("%s sta mangiando volentieri!\n", this.nome);
    }


    public void statoAnimale (){
        int vivo = (int) (Math.random()*10);
        if (vivo > 2) {
            System.out.format("%s è in salute e vive felice!", this.nome);
        } else {
            System.out.format("Purtroppo %s è morto", this.nome);
        }
    }

    public void visualizza(){

        System.out.format("""
                Sta venendo creato un animale generico con le seguenti caratteristiche:
                - nome %s;
                - numero di arti %d;
                - numero di code %s;
                - numero di occhi %d;
                - numero di orecchie %d.\n""", this.nome, this.arti,
                                                this.coda, this.occhi, this.orecchie);
    }
}
