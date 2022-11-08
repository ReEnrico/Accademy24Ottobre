package E3_Umano;

public class Occhi {
    private int numeroOcchi;
    private String coloreOcchi;

    public Occhi(int numeroOcchi, String coloreOcchi) {
        this.numeroOcchi = numeroOcchi;
        this.coloreOcchi = coloreOcchi;
    }

    public int getNumeroOcchi() {
        return numeroOcchi;
    }

    public String getColoreOcchi() {
        return coloreOcchi;
    }

    public void vista(){
        System.out.println("Grazie agli occhi è possibile vedere");
    }

}
