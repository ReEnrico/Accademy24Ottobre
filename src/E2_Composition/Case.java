package E2_Composition;

import java.awt.*;

public class Case {
    /*pojo: solo costruttore e get/set*/

    private String modello;
    private String marca;
    private String alimentazione;
    private Dimensioni dimensioni;//questa è la composizione

    public Case(String modello, String marca, String alimentazione, Dimensioni dimensioni) {
        this.modello = modello;
        this.marca = marca;
        this.alimentazione = alimentazione;
        this.dimensioni = dimensioni;
    }

    public String getModello() {
        return modello;
    }

    public String getMarca() {
        return marca;
    }

    public String getAlimentazione() {
        return alimentazione;
    }

    public Dimensioni getDimensioni() {
        return dimensioni;
    }

    public void accendi(){
        System.out.println("Bottone accensione premuto. Il processo di start è in avvio");
    }
}
