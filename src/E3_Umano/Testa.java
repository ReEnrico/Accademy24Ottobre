package E3_Umano;

public class Testa {
    private Cervello mentePersona;
    private Occhi occhiPersona;
    private Orecchie orecchiePersona;
    private Naso nasoPersona;
    private Bocca boccaPersona;

    public Testa(Cervello mentePersona, Occhi occhiPersona, Orecchie orecchiePersona, Naso nasoPersona, Bocca boccaPersona) {
        this.mentePersona = mentePersona;
        this.occhiPersona = occhiPersona;
        this.orecchiePersona = orecchiePersona;
        this.nasoPersona = nasoPersona;
        this.boccaPersona = boccaPersona;
    }

    public Cervello getMentePersona() {
        return mentePersona;
    }

    public Occhi getOcchiPersona() {
        return occhiPersona;
    }

    public Orecchie getOrecchiePersona() {
        return orecchiePersona;
    }

    public Naso getNasoPersona() {
        return nasoPersona;
    }

    public Bocca getBoccaPersona() {
        return boccaPersona;
    }
}
