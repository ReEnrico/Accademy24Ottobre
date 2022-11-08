package CiccioBurgerv1;

import java.util.HashMap;

public class HamburgerSano extends Hamburger{

    private static double conto = 0;

    public HamburgerSano(HashMap<String,Double> listaIngredienti) {
        super.aggiungiIngrediente(listaIngredienti, "Pane integrale");
    }
}
