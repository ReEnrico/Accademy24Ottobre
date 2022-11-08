package F2_Static;

public class Anagrafe {
    private String nome;
    private String cognome;
    private String dataNascita;
    private int numeroMatricola;

    /*proprietà statica di classe*/
    private static int numeroProgressimo = 0;

    public Anagrafe(String nome, String cognome, String dataNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        numeroProgressimo++;//serve per contare le istanze
        numeroMatricola = numeroProgressimo;//mirroring
    }

    public void visualizza(){
        System.out.printf("Nome: %s\nCognome %s\nData di nascita %s\nNumero matricola %d\n#############\n",
                this.nome, this.cognome, this.dataNascita, numeroMatricola);
    }
    /*altrimenti non si può vedere dall'esterno*/
    public static int getNumeroProgressimo() {
        return numeroProgressimo;
    }
}
