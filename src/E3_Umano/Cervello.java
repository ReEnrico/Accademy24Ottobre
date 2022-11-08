package E3_Umano;

public class Cervello {
    private int intelligenza;
    private String saluteMentale;

    public Cervello(int intelligenza, String saluteMentale) {
        this.intelligenza = intelligenza;
        this.saluteMentale = saluteMentale;
    }

    public int getIntelligenza() {
        return intelligenza;
    }

    public String getSaluteMentale() {
        return saluteMentale;
    }

    public void controlloSalute(String statoMentale){
        if (statoMentale.equalsIgnoreCase("male")){
            System.out.println("Cerca di prenderti un po' di riposo");
        } else {
            System.out.println("Molto bene, continua così");
        }
    }
}
