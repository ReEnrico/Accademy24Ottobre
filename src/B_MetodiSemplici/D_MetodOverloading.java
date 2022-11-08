package B_MetodiSemplici;

public class D_MetodOverloading {
    public static void main(String[] args) {
        calcolarePunteggio("Giorgia", 2000);
        calcolarePunteggio(1990);
        calcolarePunteggio(222.2);
        calcolarePunteggio("Anna");
        calcolarePunteggio();

    }/*end main*/
    /*metodo naturale*/
    public static void calcolarePunteggio(String nomeGiocatore, int punteggio){
        System.out.println(nomeGiocatore + " ha totalizzato " + punteggio + " punti");
    }
    /*come sopra ma punteggio double*/
    public static void calcolarePunteggio(String nomeGiocatore, double punteggio){
        System.out.println(nomeGiocatore + " ha totalizzato " + punteggio + " punti");
    }
    /*Metodo overload*/
    public static void calcolarePunteggio(int punteggio){
        System.out.println("Giocatore nome sconosciuto ha totalizzato " + punteggio + " punti");
    }
    /*Metodo overload con tipo diverso*/
    public static void calcolarePunteggio(double punteggio){
        System.out.println("John DOe ha totalizzato " + punteggio + " punti");
    }
    public static void calcolarePunteggio(String nomeGiocatore){
        System.out.println(nomeGiocatore + " ha totalizzato ignoti punti");
    }
    /*naked overload*/
    public static void calcolarePunteggio(){
        System.out.println("ignoto ha totalizzato ignoti punti");
    }
}
