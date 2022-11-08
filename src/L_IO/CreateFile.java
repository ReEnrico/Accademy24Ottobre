package L_IO;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

        try {
            /*Creare un nuovo file come istanza di una classe esistente*/
            File nuovoFIle = new File("FileDiTest.txt");

            /*Executive if: crea nuovo file vuoto con quel nome se tale file non esiste ancora*/
            if (nuovoFIle.createNewFile()){
                System.out.println("Ho creato un file " + nuovoFIle.getName());
        } else {
                System.out.println("File già esistente o errore su disco");
            }


        } catch (IOException e){
            System.out.println("Errore nella creazione del file");
            e.printStackTrace();
        }
    }
}
