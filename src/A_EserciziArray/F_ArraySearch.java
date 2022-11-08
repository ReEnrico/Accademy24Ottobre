package A_EserciziArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class F_ArraySearch {
    public static void main(String[] args) throws IOException {
        /* For insertion from terminal*/
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        /* Set up array length*/
        System.out.print("Insert array length (integer) max 25: ");
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
            double randomNumber = (Math.random() * range) + min;
            int arrayElement = (int) (randomNumber * 10)/10;
            intArrays.add(arrayElement);
        }
        System.out.println("We will work with this array " + intArrays);

        /* Setting for searching*/
        System.out.println("Choose a number to search: ");
        int searchKey = Integer.parseInt(buffer.readLine());

        /* Find index of searchKey*/
        int indexElment = Collections.binarySearch(intArrays, searchKey);
        if (indexElment > 0) {
            System.out.println("The chosen number " + searchKey +
                    " is present in the array in the position " + (indexElment+1));
        } else {
            System.out.println("The selected element is not present in the array");
        }

        /*Collect multiple index*/
        ArrayList<Integer> listIndex = new ArrayList<>();
        for (int i = 0; i < intArrays.size(); i++) {
            if (intArrays.get(i) == searchKey){
                listIndex.add(intArrays.indexOf(intArrays.get(i)));
            }
        }
        /* Collection.frequency*/
        if (listIndex.size() != 0){
            System.out.println("The selected number is in position(s)");
        }
    }
}
