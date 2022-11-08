package A_EserciziArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class D_ArrayOrdinare {
    public static void main(String[] args) throws IOException {

        /* To get values from terminal*/
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        /* Set up array length*/
        System.out.print("Insert array length (integer): ");
        int length = Integer.parseInt(buffer.readLine());

        /* Set up random range*/
        System.out.print("Insert max number value (integer): ");
        int max = Integer.parseInt(buffer.readLine());
        System.out.print("Insert min value (integer): ");
        int min = Integer.parseInt(buffer.readLine());
        int range = max - min;

        /* Creation of ArrayList*/
        ArrayList<Integer> intArrays = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            double randomNumber = (Math.random()*range) + min;
            int arrayElement = (int)(randomNumber*100)/20;
            intArrays.add(arrayElement);
        }
        System.out.println("The array created is\n" + intArrays);

        /* Creation second array*/
        ArrayList<Integer> secondArray = new ArrayList<>();
        /* Populate second array*/
        for (Integer intArray: intArrays) {
            secondArray.add(intArray*10);
        }
        System.out.println("The second array (multiply for 10)\n" + secondArray);

        /* Array ordinato*/
        Collections.sort(secondArray);
        System.out.println("The final sorted array is\n" + secondArray);
    }
}
