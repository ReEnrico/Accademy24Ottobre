package L_EsercitazioniVarie;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SalvataggioFile {

    File nuovoFile;

    /*Crea il file di testo con un nome che voglio io*/
    public SalvataggioFile(String string) {
        nuovoFile = new File(string);
    }

    /*Aggiunge ogni riga che passo*/
    public void addLine(String string){
        try {
            FileWriter fileWriter = new FileWriter(this.nuovoFile.getName(), true);
            fileWriter.write(string + "\n");
            fileWriter.close();

        }catch (IOException e){
            System.out.println("Errore scrittura del file");
        }

    }
}

