package E3_Umano;

public class CorpoCompleto {
    private Testa testaUmano;
    private Tronco troncoUomo;
    private ParteInferiore gambeUomo;

    public CorpoCompleto(Testa testaUmano, Tronco troncoUomo, ParteInferiore gambeUomo) {
        this.testaUmano = testaUmano;
        this.troncoUomo = troncoUomo;
        this.gambeUomo = gambeUomo;
    }

    public Testa getTestaUmano() {
        return testaUmano;
    }

    public Tronco getTroncoUomo() {
        return troncoUomo;
    }

    public ParteInferiore getGambeUomo() {
        return gambeUomo;
    }
}