package E3_Umano;

public class Naso {
    private int lunghezzaSetto;
    private int larghezzaNarici;

    public Naso(int lunghezzaSetto, int larghezzaNarici) {
        this.lunghezzaSetto = lunghezzaSetto;
        this.larghezzaNarici = larghezzaNarici;
    }

    public int getLunghezzaSetto() {
        return lunghezzaSetto;
    }

    public int getLarghezzaNarici() {
        return larghezzaNarici;
    }

    public void starnutire(){
        System.out.println("Con estrema violenza viene emesso un getto d'aria");
    }
}
