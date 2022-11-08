package CiccioBurgerv1;

import java.util.HashMap;

public class HamburgerDeluxe extends Hamburger{

    private static double prezzoColaPatatine = 5.76;

    public HamburgerDeluxe() {
        super();
    }

    @Override
    public void visualizzaOrdine() {
        super.visualizzaOrdine();
        System.out.println("Con aggiunta di " + prezzoColaPatatine);
        System.out.println("Per un totale complessivo di " + (Hamburger.getConto()+prezzoColaPatatine));
    }
}
