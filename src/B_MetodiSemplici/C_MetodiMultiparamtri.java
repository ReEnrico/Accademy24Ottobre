package B_MetodiSemplici;

public class C_MetodiMultiparamtri {
    public static void main(String[] args) {
        calcolaPunteggio(true, 1000,
                11, 12);
    }/*end main*/

    public static int calcolaPunteggio (boolean gameOver, int punteggioBase, int livelliCompletati, int bonus){
        if (gameOver){
            int punteggioFinale = punteggioBase + (livelliCompletati*bonus);
            System.out.println("Il punteggio finale è: " + punteggioFinale);
            return punteggioFinale;
        } else {
            return -1;
        }

    }/*end calcolaPunteggio*/
}
