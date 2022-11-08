package CiccioBurgerv1;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class MainCliente {

    private static Hamburger panino = new Hamburger();
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("""
                Benvenuto da Ciccio Burger, i panini più grassi del circondario!
                Offriamo tre opzioni di panino:
                1) Panino Semplice, personalizzabile con quattro aggiunte extra
                2) Panino Salutare, pane integrale, possibili sei aggiunte extra
                3) Panino Delux, comprende CocaCola e Patatine, non personalizzabile
                4) Chiudere senza scelta""");
        String scelta = bufferedReader.readLine();

        uploadMenu(panino, "canre");

        HashMap<String,Double> elencoPane = panino.readFile("menùPane");
        HashMap<String,Double> elencoCarne = panino.readFile("menùCarne");
        HashMap<String,Double> elencoExtra = panino.readFile("menùExtra");

        panino.aggiungiIngrediente(elencoPane, "Pane bianco");
        panino.aggiungiIngrediente(elencoCarne, "Carne di manzo");
        panino.aggiungiIngrediente(elencoExtra, "Maionese");
        panino.aggiungiIngrediente(elencoExtra, "Bacon croccante");
        panino.aggiungiIngrediente(elencoExtra, "Cipolla");
        panino.aggiungiIngrediente(elencoExtra, "Pomodoro");

        panino.visualizzaOrdine();
        Hamburger.azzeraConto();



        HamburgerSano paninoSano = new HamburgerSano(elencoPane);
        System.out.println("creato panino");
        paninoSano.aggiungiIngrediente(elencoCarne, "Carne di bufala");
        paninoSano.aggiungiIngrediente(elencoExtra, "Pomodoro");
        paninoSano.aggiungiIngrediente(elencoExtra, "Cipolla");
        paninoSano.aggiungiIngrediente(elencoExtra, "Maionese");
        paninoSano.aggiungiIngrediente(elencoExtra, "Ketchup");
        paninoSano.aggiungiIngrediente(elencoExtra, "Bacon croccante");
        paninoSano.aggiungiIngrediente(elencoExtra, "Salsa piccante");

        paninoSano.visualizzaOrdine();
        Hamburger.azzeraConto();


        HamburgerDeluxe paninoPlus = new HamburgerDeluxe();
        System.out.println("creato panino");
        paninoPlus.aggiungiIngrediente(elencoPane, "Pane farina di riso");
        paninoPlus.aggiungiIngrediente(elencoCarne, "Carne d'asino");

        paninoPlus.visualizzaOrdine();
        Hamburger.azzeraConto();

    }/*end main*/

    public static void prendiOpzioni(String string){

    }

    public static void uploadMenu(Hamburger panino, String string){
        HashMap<String,Double> elencoPane = panino.readFile("menùPane");
        HashMap<String,Double> elencoCarne = panino.readFile("menùCarne");
        HashMap<String,Double> elencoExtra = panino.readFile("menùExtra");
    }


}