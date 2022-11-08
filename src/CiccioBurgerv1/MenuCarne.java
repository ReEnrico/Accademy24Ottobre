package CiccioBurgerv1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;


public class MenuCarne implements CanWriteReadFile{

    private File elencoCarne;

    private static FileWriter writer;

    public MenuCarne(String nomeFile) {

        /*Creation of absolute path for file as Path istance
         * conversion in type string*/
        String dirName = String.valueOf(Paths.get(System.getProperty("user.dir")).resolve("src\\CiccioBurgerv1"));

        String fileName = nomeFile + ".txt";
        File dir = new File (dirName);

        try {
            /*Create empty file in directory specified*/
            this.elencoCarne = new File (dir, fileName);

            /*Executive if: crea nuovo file vuoto con quel nome se tale file non esiste ancora*/
            if (this.elencoCarne.createNewFile()){
                System.out.println("Elenco scelta carne completato: " + this.elencoCarne.getName());
            } else {
                System.out.println("File già esistente o errore su disco");
            }
        } catch (IOException e){
            System.out.println("Errore nella creazione del file");
            e.printStackTrace();
        }
    }

    @Override
    public void writeDown(String string) {

        try {
            this.writer = new FileWriter( String.valueOf(elencoCarne.getAbsolutePath()), true);//se aggiungo true aggiunge in coda
            this.writer.write(string + "\n");
            this.writer.close();
            System.out.println("Ingrediente aggiunto all'elenco");
        }catch (IOException e){
            System.out.println("Errore scrittura del file");
        }
    }

    @Override
    public HashMap<String, Double> readFile(String string) {
        return null;
    }
}
