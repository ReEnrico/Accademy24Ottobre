package A1;


public class R_JavaMath {
    public static void main(String[] args) {
        int primoNumero = 8;
        int secondoNumero = 78;
        double primoDouble = 78.77;
        double secondoDouble = 4;

        int maxInteri = Math.max(primoNumero, secondoNumero);
        System.out.println(maxInteri);
        /*METODI STATICI vs METODOTI NORMALI/DI ISTANZA
        * metodi funziona soggetto.qualcosa(può esserci qualcosa)
        * se "soggetto" è l'istanza di una classe allora è un metodo normali.
        *
        * Se ho Math.round(numero) è metodo statico perché è applicato direttamente
        * alla classe.
        * Questi metodi sono usati per utilities o per memorizzare tipi di informazione
        * che appartengono alla classe
        * (guarda appunti cartacei 27/10)*/
    }
}
