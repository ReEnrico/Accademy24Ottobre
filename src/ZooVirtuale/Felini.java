package ZooVirtuale;

public class Felini extends Mammiferi {

    private String specie;
    private String nome;
    final boolean volo = false;
    final boolean nuoto = false;
    final boolean coda = true;

    public Felini(int arti, boolean coda, int occhi,
                  int orecchie, int arti1, boolean volo,
                  boolean nuoto, boolean carnivoro,
                  String specie, String nome) {
        super(arti, coda, occhi, orecchie, arti1, volo, nuoto, carnivoro);
        this.specie = specie;
        this.nome = nome;
    }

    public Felini() {
    }
}
