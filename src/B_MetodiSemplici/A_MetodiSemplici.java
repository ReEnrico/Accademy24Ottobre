package B_MetodiSemplici;

public class A_MetodiSemplici {
    public static void main(String[] args) {
        /* Metodi (Funzioni): raggruppamenti di blocchi di codici per ottenere una determinata funzionalità.
        * Per evitare di ripetere codice uguale*/
        somma(5, 8);
    }/*end main*/

    /*metodo somma
    * solo in questa classe può essere usata somma, e non ha return*/
    private static void somma(int a, int b){
        int risultato = a + b;
        System.out.println("Il risultato della somma è: " + risultato);
    }/*end somma*/

    /*metodo puro che non gestisce l'output (ciò che viene restituito all'utente),
    ma il return (ciò che torna all'app)*/

    private static int sommaPura(int a, int b){
        int risultato = a + b;
        //System.out.println(risultato);
        return risultato;
    }
}/*end class*/
