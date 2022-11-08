package L_IO;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File nuovoFIle = new File("FileDiTest.txt");
        if (nuovoFIle.delete()){
            System.out.println("Ho eliminato il file" + nuovoFIle.getName());
            /*posso ancora ottenere il nome perché fino all'ultima riga le informazioni
            * sono ancora presenti*/
        } else {
            System.out.println("Errore: non sono riuscito a trovare il file");
        }
    }
}
