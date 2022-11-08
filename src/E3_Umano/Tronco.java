package E3_Umano;

public class Tronco {

    private Cuore cuorePersona;
    private Polmoni polmoniPersona;

    public Tronco(Cuore cuorePersona, Polmoni polmoniPersona) {
        this.cuorePersona = cuorePersona;
        this.polmoniPersona = polmoniPersona;
    }

    public Cuore getCuorePersona() {
        return cuorePersona;
    }

    public Polmoni getPolmoniPersona() {
        return polmoniPersona;
    }
}
