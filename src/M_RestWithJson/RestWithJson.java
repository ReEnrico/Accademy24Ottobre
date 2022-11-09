package M_RestWithJson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class RestWithJson {

    public static void main(String[] args) throws IOException{

        //richiestaGet();
        richietstaPost();

    }

    public static void richiestaGet() throws IOException {
        URL urlRichiestaGet = new URL("https://jsonplaceholder.typicode.com/posts/4");
        String risposta = null;
        /*Per convenzione di fa un cast aggiuntivo inutile ma per sicurezza*/
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

    public static void richietstaPost() throws IOException{
        final String POST_PARAMETRI = "{\n" + "\"userId\": 101,\r\n" +
                "    \"id\": 101,\r\n" +
                "    \"title\": \"Test Title\",\r\n" +
                "    \"body\": \"Test Body\"" + "\n}";

        URL urlRichiestaPost = new URL("https://jsonplaceholder.typicode.com/posts");
        HttpURLConnection connectionPost = (HttpURLConnection) urlRichiestaPost.openConnection();
        connectionPost.setRequestMethod("POST");
        connectionPost.setRequestProperty("Content-type", "application/json");
        //impostare capacità produrr output
        connectionPost.setDoOutput(true);
        //contenitore outputstream
        OutputStream outputStream = connectionPost.getOutputStream();
        //effettuo la scrittura della stringa json con getByte
        outputStream.write(POST_PARAMETRI.getBytes(StandardCharsets.UTF_8));
        //liberare memoria
        outputStream.flush();
        outputStream.close();

        int responseCode = connectionPost.getResponseCode();
        System.out.println("POST Response Code: " + responseCode);
        System.out.println("POST Response Message: " + connectionPost.getResponseCode());
    }
}
