package A1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_ArrayBreakContinue {
    public static void main(String[] args) throws IOException {
        String input = "";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //System.out.println("Scrivi qualcosa che te la ridico");

        while(!input.equalsIgnoreCase("basta")){
            System.out.println("Scrivi qualcosa che te la ridico");
            input = bufferedReader.readLine();
            if (input.equalsIgnoreCase("basta")) {
                System.out.println("Hai scelto di concludere");
                break;
            }
            if (input.equalsIgnoreCase("parolaccia")){
                System.out.println("Questa non la posso ripetere");
                continue;
            }
            System.out.println("hai scritto: " + input);
        }
    }
}
