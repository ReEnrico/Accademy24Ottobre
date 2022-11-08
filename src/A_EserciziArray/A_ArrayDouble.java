package A_EserciziArray;

import java.util.ArrayList;
import java.lang.Math;
import java.util.Scanner;

public class A_ArrayDouble {
    public static void main(String[] args) {
        ArrayList<Double> doubleNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // set the lenght
        System.out.println("What lenght? Interger number");
        int lenght = scanner.nextInt();
        scanner.nextLine();

        // define the range
        System.out.println("Insert max number (integer)");
        int max = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Insert min number (integer)");
        int min = scanner.nextInt();
        scanner.nextLine();
        int range = max - min + 1;


        /* Populate the array*/
        for (int i = 0; i < lenght; i++){
            double random = (Math.random()*range) + min;
            doubleNumbers.add(random);
        }

        /* Print array*/
        for (int i = 0; i < doubleNumbers.size(); i++) {
            double element = doubleNumbers.get(i);
            int temp = (int)(element*100.0);
            double eleCut = ((double)temp)/100.0;
            System.out.println("Element " + (i + 1) + " is " + eleCut);
        }

        /* Print with foreach*/
        int counter = 0;
        for (Double doubleNumber: doubleNumbers) {
            int temp = (int)(doubleNumber*100.0);
            double element = ((double)temp)/100.0;
            System.out.println("Element " + (counter + 1) + " is " + element);
            counter += 1;
        }
    }
}
