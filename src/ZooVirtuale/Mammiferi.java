package ZooVirtuale;

public class Mammiferi extends AnimaleZoo{

    protected int arti;
    protected boolean volo;
    protected boolean nuoto;
    private boolean carnivoro;


    public Mammiferi(int arti, boolean coda, int occhi, int orecchie, int arti1,
                     boolean volo, boolean nuoto, boolean carnivoro) {
        //super(arti, coda, occhi, orecchie);
        this.arti = arti1;
        this.volo = volo;
        this.nuoto = nuoto;
        this.carnivoro = carnivoro;

    }

    public Mammiferi() {}

    public void modoDiNutrirsi (){
        if(carnivoro){
            System.out.println("Il mammifero ha cacciato la sua preda e ora la sta mangiando.");
        } else {
            System.out.println("Il mammifero sta tranquillamente brucando nel pascolo.");
        }
    }
    @Override
    public void mangiare() {
        super.mangiare();
        modoDiNutrirsi();
    }

    @Override
    public void movimento() {
        super.movimento();
        if (volo  && !nuoto){
            System.out.println("Il mammifero sta volando felice in cielo.");
        } else if (!volo && nuoto) {
            System.out.println("Il mammifero sta nuotando libero nel mare.");
        }else {
            System.out.println("Il mammifero corre entusiasta nella prateria");
        }
    }
}
