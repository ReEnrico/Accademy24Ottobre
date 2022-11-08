package A_EserciziArray;

import java.util.ArrayList;

public class E_ArrayPari {
    public static void main(String[] args) {

        /*Creation of array*/
        ArrayList<Integer> completeArrays = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            completeArrays.add(i+1);
        }
        System.out.println("The first array is " + completeArrays);

        /* Creation second array*/
        ArrayList<Integer> onlyEvens = new ArrayList<>();
        for (Integer completeArray: completeArrays) {
            if (completeArray%2 == 0){
                onlyEvens.add(completeArray);
            }
        }
        System.out.println("The only even number are " + onlyEvens);
    }
}
