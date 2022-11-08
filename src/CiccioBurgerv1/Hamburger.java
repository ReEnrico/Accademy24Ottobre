package CiccioBurgerv1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Hamburger implements CanWriteReadFile{

    private HashMap<String, Double> hamburger;

    private static double conto = 0;

    public Hamburger() {
        this.hamburger = new HashMap<String, Double>();
    }


    public static double getConto() {
        return conto;
    }

    @Override
    public HashMap<String, Double> readFile(String fileName) {
        HashMap<String, Double> listaGenerica = new HashMap<>();

        File nuovoFIle = new File(String.valueOf(Paths.get(
                System.getProperty("user.dir")).resolve(
                "src\\CiccioBurgerv1\\" + fileName + ".txt")));
        if (nuovoFIle.exists()) {
            String pathFile = nuovoFIle.getAbsolutePath();
            Path path = Paths.get(pathFile);

            long lines;
            try {
                lines = Files.lines(path).count();

                Scanner scanner = new Scanner(nuovoFIle);

                int length = 0;
                while (length < lines - 1) {
                    String ingrediente = "";
                    double prezzo;
                    ArrayList<String> tokenList = new ArrayList<>();
                    //su lettura posso agire con i metodi di stringa
                    String lettura = scanner.nextLine();
                    String newLettura = lettura.replace(",", ".");
                    StringTokenizer token = new StringTokenizer(newLettura);
                    for (int i = 1; token.hasMoreTokens(); i++) {
                        tokenList.add(token.nextToken());
                    }
                    prezzo = Double.parseDouble(tokenList.get(tokenList.size() - 1));
                    for (int i = 0; i < tokenList.size() - 1; i++) {
                        ingrediente += tokenList.get(i) + " ";
                    }
                    listaGenerica.put(ingrediente.trim(), prezzo);
                    length++;
                }
                scanner.close();
            } catch (IOException e) {
                System.out.println("Errore lettura file");
                e.printStackTrace();
            }
        }
        return listaGenerica;
    }/*end readFile*/

    public void aggiungiIngrediente (HashMap<String, Double> ingredienti, String scelta){
        this.hamburger.put(scelta, ingredienti.get(scelta));
        conto += ingredienti.get(scelta);
    }

    public void visualizzaOrdine(){
        System.out.println("Il panino ordinato contiene:");
        for (String componente: this.hamburger.keySet()) {
            System.out.printf("%s %.2f€\n", componente, this.hamburger.get(componente));
        }
        System.out.printf("Il totale è: %.2f€\n####################\n\n", conto);
    }

    public static void azzeraConto(){
        conto = 0;
    }

    @Override
    public void writeDown(String string) {

    }
}
