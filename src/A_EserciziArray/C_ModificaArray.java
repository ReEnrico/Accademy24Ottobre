package A_EserciziArray;


import java.util.ArrayList;

public class C_ModificaArray {
    public static void main(String[] args) {

        double[] arrayDouble = new double[6];
        arrayDouble[0] = 7.8;
        arrayDouble[1] = 9.8;
        arrayDouble[2] = 0.6;
        arrayDouble[3] = 2.2;
        arrayDouble[4] = 4.2;
        arrayDouble[5] = 3.5;

        /* Add the previous array to an arraylist element by element*/
        ArrayList<Double> doubleDoubles = new ArrayList<>();
        for (int i = 0; i < arrayDouble.length; i++) {
            doubleDoubles.add(arrayDouble[i]);
        }
        /* Add a new first and last element to arraylist*/
        doubleDoubles.add(0, 40.3);
        doubleDoubles.add(33.33);

        System.out.println(doubleDoubles);
    }
}
