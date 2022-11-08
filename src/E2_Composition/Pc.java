package E2_Composition;

public class Pc {
    /*qui si mettono le relazioni has a*/
    private Case ilCase;
    private Monitor ilMonitor;
    private SchedaMadre laSchedaMadre;

    public Pc(Case ilCase, Monitor ilMonitor, SchedaMadre laSchedaMadre) {
        this.ilCase = ilCase;
        this.ilMonitor = ilMonitor;
        this.laSchedaMadre = laSchedaMadre;
    }

    public Case getIlCase() {
        return ilCase;
    }

    public Monitor getIlMonitor() {
        return ilMonitor;
    }

    public SchedaMadre getLaSchedaMadre() {
        return laSchedaMadre;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
