package A1;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class H_Arrays {
    public static void main(String[] args) {
        /* Gli array sono contenitori di valori multivalori
        * Sono reference type*/

        /*creazione modalità classica*/
        String[] mesi = {
                "Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"};
        System.out.println(mesi[0]);
        /* Hanno dimensione fissa*/

        /* Seconda modalità: dichiarativa*/
        int[] arrayNumb = new int[4];//così è vuoto, lo devo popolare
        arrayNumb[0] = 2;
        arrayNumb[1] = 45;
        arrayNumb[2] = 4;
        arrayNumb[3] = 14;
        /* o si fa indice per indice arrayNumb[0] = 3 ecc
        * oppure si usa il metodo overlodato toString()
        * Arrays.toString(arrayNumb) e lo crea ma gli elementi devono già essere stati inseriti, viene stampato tutto*/
        //System.out.println(Arrays.toString(mesi));
        /* Cambiare il valore è facile*/
        mesi[0] = "1000";
        /*lenght è una proprietà get, non un metodo*/
        System.out.println(mesi.length);

        /* Ciclo for:
        * valore iniziale del contatore
        * clasusola di arresto
        * incremento*/
        for (int i = 0; i < mesi.length; i++){
            System.out.println(mesi[i]);
        }
        int somma = 0;
        for (int i = 0; i < arrayNumb.length; i++) {
            somma += arrayNumb[i];
        }
        System.out.println(somma);

        int max = arrayNumb[0];
        for (int i = 0; i < arrayNumb.length; i++) {
            if (arrayNumb[i] > max){
                max = arrayNumb[i];
            }
        }
        System.out.println(max);
        for (String mese: mesi) {
            System.out.println(mese);
        }

        /* Ciclo While
        * un po' più brutto*/
        int y = 0; //contatore
        while (y < mesi.length){
            System.out.println(mesi[y]);
            y++;
        }

        /* Ciclo DO-While
        * prima esegue e poi valuta, quindi il contrario di prima*/
        int indx = 0;
        do {
            System.out.println(mesi[indx]);
            indx++;
        } while (indx < mesi.length);

        /* Array multimensionale: array annidati */
        int[][] arrAnnidati = {{1, 2, 3}, {4, 5, 6}};

        /* for attraverso gli array*/
        for (int i = 0; i < arrAnnidati.length; i++) {
            System.out.println(Arrays.toString(arrAnnidati[i]));
            for (int j = 0; j < arrAnnidati[i].length; j++) {
                System.out.print(arrAnnidati[i][j] + " ");
            }
            System.out.println("");
        }

    }

}
