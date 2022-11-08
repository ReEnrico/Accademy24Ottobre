package CiccioBurgerv1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class MenuPane implements CanWriteReadFile {

    private File elencoPane;


    private static FileWriter writer;


    public MenuPane(String nomeFile) {

        /*Creation of absolute path for file as Path istance
         * conversion in type string*/
        String dirName = String.valueOf(Paths.get(System.getProperty("user.dir")).resolve("src\\CiccioBurgerv1"));

        String fileName = nomeFile + ".txt";
        File dir = new File(dirName);

        try {
            /*Create empty file in directory specified*/
            this.elencoPane = new File(dir, fileName);

            /*Executive if: crea nuovo file vuoto con quel nome se tale file non esiste ancora*/
            if (this.elencoPane.createNewFile()) {
                System.out.println("Elenco scelta pane completato: " + this.elencoPane.getName());
            } else {
                System.out.println("File già esistente o errore su disco");
            }
        } catch (IOException e) {
            System.out.println("Errore nella creazione del file");
            e.printStackTrace();
        }

    }

    @Override
    public void writeDown(String string) {

        try {
            this.writer = new FileWriter(String.valueOf(elencoPane.getAbsolutePath()), true);//se aggiungo true aggiunge in coda
            this.writer.write(string + "\n");
            this.writer.close();
            //System.out.println("Ingrediente aggiunto all'elenco");
        } catch (IOException e) {
            System.out.println("Errore scrittura del file");
        }
    }

    @Override
    public HashMap<String, Double> readFile(String string) {
        return null;
    }/*end creaListaPane*/
}
