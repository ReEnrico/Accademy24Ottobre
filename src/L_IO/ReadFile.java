package L_IO;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File nuovoFIle = new File("FileDiTest.txt");
            /*Creo scanner per leggere*/
            Scanner scanner = new Scanner(nuovoFIle);
            while (scanner.hasNextLine()){
                String lettura = scanner.nextLine();
                System.out.println(lettura);
            }
            scanner.close();
        } catch (IOException e){
            System.out.println("Errore lettura file");
            e.printStackTrace();
        }
    }
}
