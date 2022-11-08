package A1;

import java.util.Scanner;

public class I_BMIConControlli {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double peso = 0;
        double altezza = 0;

        System.out.println("Inserire il peso in kg:");
        while (true) {
            /*Inserimento peso*/
            if (scanner.hasNextDouble() == true){
                peso = scanner.nextDouble();
                if (peso <= 0){
                    System.out.println("Massa negativa? Non mi sembra possibile");
                    continue;
                }
                break;
            } else {
                System.out.println("Peso non valido, richiesto un numero");
                scanner.nextLine();
            }
        }

        scanner.nextLine();

        System.out.println("Inserire l'altezza in m:");
        while (true){
            if (scanner.hasNextDouble() == true){
                altezza = scanner.nextDouble();
                if (altezza <= 0){
                    System.out.println("Esiste una lunghezza minima non superabile e comunque è non negativa");
                    continue;
                }
                break;
            } else {
                System.out.println("Altezza non valida, richiesto un numero");
                scanner.nextLine();
            }
        }

        double rapporto = peso/(altezza*altezza);
        int temp = (int)(rapporto*100.0);
        double ibm = ((double)temp)/100.0;

        /* Meno stringhe ripetute, ne basta una e il tipo di obesità è una variabiel stringa*/
        String categoria = "";
        if (ibm > 40){
            categoria = "obesità terzo grado";
        }
        else if (ibm > 35  && ibm <= 40){
            categoria = "obesità secondo grado";
        }
        else if (ibm > 30.1 && ibm <= 34.9){
            categoria = "obesità primo grado";
        }
        else if (ibm >= 25 && ibm <= 30){
            categoria = "sovrappeso";
        }
        else if (ibm >= 18.5 && ibm <= 24.9){
            categoria = "normopeso";
        }
        else if (ibm >= 16.5 && ibm <= 18.4){
            categoria = "sottopeso";
        }
        else {
            categoria = "sottopeso severo";
        }

        System.out.println("Le tue caratteristiche sono: altezza " + altezza +
                "; peso " + peso + ". Quindi il tuo BMI è: " + ibm + ", quindi sei " + categoria);
    }
}
