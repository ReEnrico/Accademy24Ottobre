package A_EserciziArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class SassoCartaForbiciComune {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var moveName = new HashMap<String, String>();
        var winningGame = new ArrayList<String>();
        var randomGenerator = new Random();
        var userWin = 0;
        var computerWin = 0;

        // Variable Initialization
        moveName.put("1", "sasso");
        moveName.put("2", "carta");
        moveName.put("3", "forbici");
        moveName.put("4", "lucertola");
        moveName.put("5", "spock");

        winningGame.add("13");
        winningGame.add("14");
        winningGame.add("21");
        winningGame.add("25");
        winningGame.add("32");
        winningGame.add("34");
        winningGame.add("42");
        winningGame.add("45");
        winningGame.add("51");
        winningGame.add("53");

        // Game logic
        System.out.println("Inizio gioco.\n");

        outerloop:
        while (true) {
            System.out.print("""
                    Scegli una di queste
                    (1) Sasso
                    (2) Carta
                    (3) Forbici
                    (4) Lucertola
                    (5) Spock
                    (6) Stop
                    """);

            String userInput = null;
            while (true) {
                System.out.print("Scelta: ");
                userInput = br.readLine();
                if (userInput.equalsIgnoreCase("6")) {
                    System.out.println("Termine partita.");
                    System.out.println("L'utente ha vinto " + userWin + " turni, " +  "il computer ha vinto " + computerWin + " turni.");
                    if (userWin == computerWin) {
                        System.out.println("Hai pareggiato con il computer.");
                    } else {
                        System.out.println(userWin > computerWin ? "Hai battuto il computer." : "Sei stato battuto dal computer");
                    }
                    break outerloop;
                } else if (! moveName.containsKey(userInput)) {
                    System.out.println("La scelta non è tra quelle esistenti.");
                } else {
                    break; // abbiamo un input
                }
            }

            String computerInput = Integer.toString(1 + randomGenerator.nextInt(5));
            System.out.print(
                    "Il computer ha scelto " + moveName.get(computerInput) +
                            " e tu hai scelto " + moveName.get(userInput) + ": ");
            if (userInput.equals(computerInput)) {
                System.out.println("Pareggio.");
            } else if (winningGame.contains(userInput + computerInput)) {
                userWin++;
                System.out.println("Hai vinto.");
            } else {
                computerWin++;
                System.out.println("Hai perso.");
            }
            System.out.println();
        }
    }
}