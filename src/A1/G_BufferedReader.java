package A1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G_BufferedReader {
    public static void main(String[] args) throws IOException {//gestione delle eccezioni di input-output
        /* Senza InputStream... buffered non è capace di leggere in ingresso
        * perché lui guarda solo l'uscita*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*System.out.println("Inserisci un intero");
        *//* per buffer tutto ciò che arriva è una stringa, quindi devo trasformare
        * entra im gioco la wrapped class*//*
        int primoIntero = Integer.parseInt(br.readLine());

        System.out.println("hai scelto: " + primoIntero);

        System.out.println("Inserisci un numero qualsiasi");
        *//* per buffer tutto ciò che arriva è una stringa, quindi devo trasformare
         * entra im gioco la wrapped class. Qui da terminale ci va il punto non la virgola per i decimali*//*
        var primoDouble = Double.parseDouble(br.readLine());

        System.out.println("hai scelto: " + primoDouble);*/

        System.out.println("Inserisci una stringa");
        /* per buffer tutto ciò che arriva è una stringa, quindi siamo a posto.
        * Ma lo si deve far leggere riga per riga per evitare di riempire la memoria!*/
        String primaStringa = br.readLine();

        System.out.println("hai scritto: " + primaStringa);
    }
}
