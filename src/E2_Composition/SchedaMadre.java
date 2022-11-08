package E2_Composition;

public class SchedaMadre {
    private int modello;
    private String marca;
    private int slotRam;
    private String bios;

    public SchedaMadre(int modello, String marca, int slotRam, String bios) {
        this.modello = modello;
        this.marca = marca;
        this.slotRam = slotRam;
        this.bios = bios;
    }

    public int getModello() {
        return modello;
    }

    public String getMarca() {
        return marca;
    }

    public int getSlotRam() {
        return slotRam;
    }

    public String getBios() {
        return bios;
    }

    public void caricamentoProgramma (String programma) {
        System.out.format("Il programma %s è in avvio", programma);
    }
}
