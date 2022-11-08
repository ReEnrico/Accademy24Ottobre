package E3_Umano;

public class Main {
    public static void main(String[] args) {

        CorpoCompleto corpo = new CorpoCompleto(
                                        new Testa(new Cervello(166, "Buona"),
                                                new Occhi(2, "Verdi"),
                                                new Orecchie(2, 4),
                                                new Naso(10, 8),
                                                new Bocca(32, 1, 2)),
                                        new Tronco(new Cuore(5, "Ottimo"),
                                                    new Polmoni(2, "Buona")),
                                        new ParteInferiore(2, 2));

        System.out.println(corpo.getGambeUomo().getNumeroGambe());

        corpo.getTestaUmano().getMentePersona().controlloSalute("male");
        corpo.getTestaUmano().getBoccaPersona().mangiare();
    }
}
