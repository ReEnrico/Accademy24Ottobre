package A1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class D_Strings {
    public static void main(String[] args) {
        //stringe sono reference, ma non è necessario un costruttore come nei primitive type
        String parola = "PAROLA!";
        //hanno dei metodi
        System.out.println(parola.length());
        System.out.println(parola.toLowerCase());
        //ricerca, case sensitive e -1 se non trova nulla
        System.out.println(parola.indexOf("O"));
        //concatenazione
        String parola2 = "Questa \"stringa\" ha più parole";
        System.out.println(parola + parola2);
        //metodo concat
        System.out.println(parola.concat(parola2));

        /*int numIInt = 79;
        String numbstring = (String) numINt;*/
        //Trim per togliere spazi vuoti solo testa e coda
        String stringSpazio = "   Questa stinga ha spazi  ";
        System.out.println(stringSpazio);
        System.out.println(stringSpazio.trim());
        //Replace sostituire carattere
        System.out.println(stringSpazio.replace("e", "3")
                .replace("a", "4").
                replace("i", "1").
                trim());
        //Controllare se stringa è vuota o meno
        String vuoto = "";
        System.out.println(vuoto.isEmpty());
        System.out.println(vuoto.isBlank());
        //uguaglianza disuguaglianza
        String word = "Albero";
        if (word.equals("albero")){//case sentitive
            System.out.println("sono uguali");
        } else {
            System.out.println("Non corrispondono");
        }
        if (word.equalsIgnoreCase("albero")){
            System.out.println("sono uguali al di là delle maiuscole");
        }

        //le costanti = una variabile che non può essere modificata dopo la dichiarazione
        final String meseCorrente = "Ottobre";// final è il modificatore
        final double pi = 3.14;
    }

    public String scrivi(){
        return "hgp";
    }
}