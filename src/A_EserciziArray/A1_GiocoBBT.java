package A_EserciziArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class A1_GiocoBBT {

    public static void main(String[] args) throws IOException, InterruptedException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        /* hashmap superiore per scelta utente*/
        HashMap<Integer, Map<Integer, Boolean>> sceltaUtente = new HashMap<>();

        /*hashmap 1*/
        HashMap<Integer, Boolean> winLoose1 = new HashMap<>();
        winLoose1.put(3, true);
        winLoose1.put(5, true);
        winLoose1.put(2, false);
        winLoose1.put(4, false);
        /*hashmap 2*/
        HashMap<Integer, Boolean> winLoose2 = new HashMap<>();
        winLoose2.put(1, true);
        winLoose2.put(4, true);
        winLoose2.put(3, false);
        winLoose2.put(5, false);
        /* hashmap 3*/
        HashMap<Integer, Boolean> winLoose3 = new HashMap<>();
        winLoose3.put(2, true);
        winLoose3.put(4, true);
        winLoose3.put(1, false);
        winLoose3.put(5, false);
        /* hashmap 4*/
        HashMap<Integer, Boolean> winLoose4 = new HashMap<>();
        winLoose4.put(1, true);
        winLoose4.put(3, true);
        winLoose4.put(2, false);
        winLoose4.put(5, false);
        /*hashmap 5*/
        HashMap<Integer, Boolean> winLoose5 = new HashMap<>();
        winLoose5.put(2, true);
        winLoose5.put(4, true);
        winLoose5.put(1, false);
        winLoose5.put(3, false);

        /*Hashmap grande*/
        sceltaUtente.put(1, winLoose1);
        sceltaUtente.put(2, winLoose2);
        sceltaUtente.put(3, winLoose3);
        sceltaUtente.put(4, winLoose4);
        sceltaUtente.put(5, winLoose5);

        //System.out.println(sceltaUtente);
        ArrayList<String> names = new ArrayList<>();
        names.add("Rock");
        names.add("Paper");
        names.add("Scissor");
        names.add("Spock");
        names.add("Lizard");

        //TimeUnit.SECONDS.sleep(2);
        int game = 1;
        int wins = 0;
        int winpc = 0;
        while (true) {
            System.out.println("Start game " + game);
            /* Start game*/
            System.out.println("""
                Maps of choices:
                1) Rock
                2) Paper
                3) Scissors
                4) Spock
                5) Lizard
                6) Insert 0 for quit""");
            System.out.print("Choose your fate: ");
            int keyUtente = Integer.parseInt(buffer.readLine());
            if (keyUtente == 0) {
                System.out.println("Okay, no more game :)\n You won " + wins + "\n PC won " + winpc);
                if (wins > winpc){
                    System.out.println("Congrats! You won more times than the PC!!");
                }
                break;
            }
            //TimeUnit.SECONDS.sleep(1);

            int keyPc = (int)(Math.random()*5) + 1;
            System.out.println("You selected: " + names.get(keyUtente-1) + "\nPC selected: " + names.get(keyPc-1));
            //TimeUnit.SECONDS.sleep(1);

            if (keyUtente == keyPc){
                System.out.println("Same choice! Another round!");
                //TimeUnit.SECONDS.sleep(3);
                game++;
                continue;
            }

           if (sceltaUtente.get(keyUtente).get(keyPc)){
               wins++;
               //System.out.println("WOW YOU WIN! NEXT ROUND!\nGame won: " + wins);
           } else {
               System.out.println("Sorry, not this time. BUT best luck next time!");
               winpc++;
           }
           game++;
            //TimeUnit.SECONDS.sleep(3);
        }
    }
}
