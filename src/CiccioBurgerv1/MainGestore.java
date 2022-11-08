package CiccioBurgerv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class MainGestore {

    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{

        mostraOperazioni();


    }/*end main*/

    public static void mostraOperazioni() throws IOException{
        /*Comincio creando un "database" per gli ingredienti
        * implementato solo opzione 1*/
        System.out.println("""
                Salve, scelga un'operazione fra le seguenti:
                1) Creare uno o più nuovi elenchi di ingredienti
                2) Consultare gli elenchi già esistenti
                3) Chiudere l'applicazione""");
        String sceltaOpzione = bufferedReader.readLine();
        if (sceltaOpzione.equals("1")){
            creazioneElenchi();
            mostraOperazioni();
        }else {
            System.out.println("Fine operazioni");
        }
    }

    public static void creazioneElenchi() throws IOException{
        System.out.println("""
                Proceda con la crezione degli elenchi degli ingredienti, scegliendo fra:
                1) Inserimento tipi di pane
                2) Inserimento tipi di carne
                3) Inserimento di ingredienti extra opzionali
                4) Ritorno al menù precedente""");

        String sceltaElenco = bufferedReader.readLine();

        /*uso if else perché sono richieste molte operazioni
        * e per me è una sintassi più comprensibile*/

        if (sceltaElenco.equals("1")){
            aggiuntaPane();
            creazioneElenchi();
        } else if (sceltaElenco.equals("2")){
            aggiuntaCarne();
            creazioneElenchi();
        }else if (sceltaElenco.equals("3")){
            aggiuntaExtra();
            creazioneElenchi();
        } else if (sceltaElenco.equals("4")) {
            System.out.println("Chiusura menù attuale");
        }
    }/*end creazioneElenchi*/


    public static void aggiuntaPane () throws IOException{

        /*il nome di questo elenco dovrà essere personalizzabile*/
        MenuPane listaPane = new MenuPane("MenùPane");
        System.out.println("""
                    Inserire gli ingredienti assieme al prezzo di vendita.
                    Per terminare l'inserimento scrivere la parola \"stop\"""");
        String ingrediente;
        do {
            ingrediente = bufferedReader.readLine();

            if (!ingrediente.equalsIgnoreCase("stop")){
                listaPane.writeDown(ingrediente);
                System.out.println("Oggetto aggiunto.\nNuovo inserimento");
            }else {
                listaPane.writeDown("Last update " + LocalDate.now());
            }
        }
        while (!ingrediente.equalsIgnoreCase("stop"));
    }/*end aggiuntaPane*/

    public static void aggiuntaCarne () throws IOException{

        /*il nome di questo elenco dovrà essere personalizzabile*/
        MenuCarne listaCarne = new MenuCarne("MenùCarne");
        System.out.println("""
                    Inserire gli ingredienti assieme al prezzo di vendita.
                    Per terminare l'inserimento scrivere la parola "stop""");
        String ingrediente;
        do {
            ingrediente = bufferedReader.readLine();

            if (!ingrediente.equalsIgnoreCase("stop")){
                listaCarne.writeDown(ingrediente);
                System.out.println("Oggetto aggiunto.\nNuovo inserimento");
            }else {
                listaCarne.writeDown("Last update " + LocalDate.now());
            }

        }
        while (!ingrediente.equalsIgnoreCase("stop"));
    }/*end aggiuntaCarne*/

    public static void aggiuntaExtra () throws IOException{

        /*il nome di questo elenco dovrà essere personalizzabile*/
        MenuExtra listaExtra = new MenuExtra("MenùExtra");
        System.out.println("""
                    Inserire gli ingredienti assieme al prezzo di vendita.
                    Per terminare l'inserimento scrivere la parola \"stop\"""");
        String ingrediente;
        do {
            ingrediente = bufferedReader.readLine();

            if (!ingrediente.equalsIgnoreCase("stop")){
                listaExtra.writeDown(ingrediente);
                System.out.println("Oggetto aggiunto.\nNuovo inserimento");
            }else {
                listaExtra.writeDown("Last update " + LocalDate.now());
            }

        }
        while (!ingrediente.equalsIgnoreCase("stop"));
    }/*aggiuntaExtra*/

    }


