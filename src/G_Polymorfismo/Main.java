package G_Polymorfismo;

class Film {
    private String nome;

    public Film(String nome) { this.nome = nome; }

    public String trama(){ return "Non c'è trama"; }

    public String getNome() { return nome; }
}

class PorcoRosso extends Film{
    public PorcoRosso() { super("Porco Rosso"); }

    @Override
    public String trama() {
        return "Marco, un pirata del cielo Maiale, vola nei cieli cercando di sopravvivere ai fascisti";
    }
}

class LaPrincipessaSplendente extends Film {
    public LaPrincipessaSplendente() { super("La Principessa Splendente"); }

    @Override
    public String trama() {
        return "Uno spaccato del Giappone feudale in un'ottica fantasy";
    }
}

class LaPrincipessaMonosoke extends Film {
    public LaPrincipessaMonosoke() { super("La Principessa Monosoke"); }

    @Override
    public String trama() {
        return "Pesante critica all'uomo che per inseguire il denaro distrugge l'ambiente";
    }
}

/*Classe limp (limped)*/
class FilmCheNonRicordo extends Film {
    public FilmCheNonRicordo() {
        super("Film chr non ricordo");
    }
}
    /*è voluto che sia vuoto così che il polimorfismo vada a prendere quello dalla superclasse*/



/*Classe main con metodo main ======================================================================================= */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            Film film = filmRandom();
            System.out.println("Film numero " + i + "\n" +
                    "Nome film " + film.getNome() + "\n" +
                    "Trama " + film.trama());
        }

    }

    /*metodo che pesca il film dall'elenco delle istanze*/
    public static Film filmRandom(){
        int numeroRandom = (int) (Math.random()*4) + 1;
        switch (numeroRandom){
            case 1: return new PorcoRosso();
            case 2: return new LaPrincipessaMonosoke();
            case 3: return new LaPrincipessaSplendente();
            case 4: return new FilmCheNonRicordo();
        }
        return null;
    }
}
