package M_RestWithJson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MethodsForjsonPlaceholder {

    public static void gestioneInterazione() throws IOException{

        String scelta = MethodsForjsonPlaceholder.inputToString();
        if (Integer.parseInt(scelta) <7 && Integer.parseInt(scelta) > 0){
            MethodsForjsonPlaceholder.richiestaGet(scelta);
        } else if (Integer.parseInt(scelta) == 7){
            MethodsForjsonPlaceholder.richiestaGetAdvanced();
        } else {
            System.out.println("Quit");
        }
    }

    public static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

    public static String inputToString () throws IOException {
        System.out.println("""
                Fake API usage example: communication with server (?) to read/get information.
                Json Placeholder is exploited for this exercise.
                It has six type of resources:
                1) Posts
                2) Comments
                3) Albums
                4) Photos
                5) Todos
                6) Users
                What type of content do you want to visualized?
                Press 7 for advance search.
                0 to end the session.
                """);
        String choise = buffer.readLine();

        return choise;
    }

    public static void richiestaGet(String string) throws IOException {
        String request = "";
        switch (string){
            case "1" -> request = "posts";
            case "2" -> request = "comments";
            case "3" -> request = "albums";
            case "4" -> request = "photos";
            case "5" -> request = "todos";
            case "6" -> request = "users";
        }
        URL urlRichiestaGet = new URL("https://jsonplaceholder.typicode.com/" + string);

        String risposta = null;

        HttpURLConnection connection = (HttpURLConnection) urlRichiestaGet.openConnection();

        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if(responseCode == HttpURLConnection.HTTP_OK){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer response = new StringBuffer();
            while ((risposta = bufferedReader.readLine()) != null){
                response.append(risposta).append("\n");
            }
            bufferedReader.close();

            System.out.println("Stringa Json" + response.toString());
        } else {
            System.out.println("Richiesta non è andata a buon fine");
        }
    }

    public static void richiestaGetAdvanced() throws IOException{
        System.out.println("""
                It's possible to do a combined research using specific keywords, for example:
                "comments post 2" whose output are every comments related to the second post.
                An error will be displayed if the search elements do not exist.""");
        String searchKeys = buffer.readLine();

        ArrayList<String> tokenList = new ArrayList<>();

        StringTokenizer token = new StringTokenizer(searchKeys);
        for (int i = 1; token.hasMoreTokens(); i++) {
            tokenList.add(token.nextToken());
        }
        URL urlRichiestaGet = new URL(String.format("https://jsonplaceholder.typicode.com/%s?%sid=%s",
                                                    tokenList.get(0),
                                                    tokenList.get(1),
                                                    tokenList.get(2)));

        String risposta = null;

        HttpURLConnection connection = (HttpURLConnection) urlRichiestaGet.openConnection();

        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if(responseCode == HttpURLConnection.HTTP_OK){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer response = new StringBuffer();
            while ((risposta = bufferedReader.readLine()) != null){
                response.append(risposta).append("\n");
            }
            bufferedReader.close();

            System.out.println("Stringa Json" + response.toString());
        } else {
            System.out.println("Richiesta non è andata a buon fine");
        }

    }


}
