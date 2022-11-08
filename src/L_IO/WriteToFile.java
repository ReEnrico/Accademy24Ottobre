package L_IO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("FileDiTest.txt");//se aggiungo true aggiunge in coda
            fileWriter.write("Ehi sto scrivendo su un file\t");
            fileWriter.write("usando però un programma a parte\n");
            fileWriter.write("E non vedo in realtà che succede");

            fileWriter.close();
            System.out.println("Ho scritto nel file con successo");
        }catch (IOException e){
            System.out.println("Errore scrittura del file");
        }
    }
}
