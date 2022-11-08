package F_Encapsulation;

public class GiocatoreIncapsulato {
    /* quindi prima di tutto sono private*/
    private String nome;
    private int salute;
    private String arma;

    /*regolo io l'inizializzazione delle istanze con il costruttore*/

    public GiocatoreIncapsulato(String nome, int salute, String arma) {
        this.nome = nome;
        this.salute = salute;
        this.arma = arma;
    }

    /*implemento metodi pubblici che regolano la variazione delle proprietà delle istanze*/
    public void perditaSalute(int danno) {
        this.salute -= danno;
        if (this.salute <= 0) {
            System.out.println("Game over");
        }
        System.out.printf("salute totale %d", this.salute);
    }

        public void acquistaSalute (int cura){
            this.salute += cura;
            System.out.printf("salute totale %d", this.salute);
        }

        public void visualizza(){
            System.out.printf("Giocatore %s possiede %d salute", this.nome, this.salute);
        }
}
