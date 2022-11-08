package L_IO;

import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        File nuovoFIle = new File("FileDiTest.txt");
        if (nuovoFIle.exists()){
            System.out.println("Nome file " + nuovoFIle.getName());
            System.out.println("Il percorso " + nuovoFIle.getAbsolutePath());
            System.out.println("Leggibile? " + nuovoFIle.canRead());
            System.out.println("Scrivibile? " + nuovoFIle.canWrite());
            System.out.println("Dimensioni file " + nuovoFIle.length());
            System.out.println("Ultima Modifica " + nuovoFIle.lastModified());
        }
    }
}
