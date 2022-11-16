import java.util.*;

public class TestCodewars {

    //import org.apache.commons.text.WordUtils;

    public static void main(String[] args) {

        /*input fizz%3
        * buzz%5
        * fizzbuzz%3e5*/
        System.out.println("Inserire un numero intero.");
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        try{
            numero = scanner.nextInt();
        } catch (Exception e){
            System.out.println("Non è un numero intero");
        }
        for (int i = 0; i <= numero; i++) {
            if ((i%3 == 0) && (i%5 == 0)){
                System.out.println("fizz buzz");
            } else if (i%5 == 0){
                System.out.println("buzz");
            } else if (i%3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }
        }







       /* StringTokenizer st = new StringTokenizer("this is a test");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }*/

        /*String str = "The world is nice";
        StringTokenizer token = new StringTokenizer(str);
        ArrayList<String> breakString = new ArrayList<>();
        String reverse= "";
        while(token.hasMoreTokens()){
            breakString.add(token.nextToken());
        }
        //System.out.println(breakString);
        for (int i = 0; i < breakString.size(); i++){
            System.out.println(breakString.get((breakString.size()-1)-i));
        }
        System.out.println(reverse);*/


        //System.out.println(WordUtils.capitalize("most trees are blue"));

        /*HashMap<Integer, ArrayList<Integer>> numeriDispari = new HashMap();
        for (int i = 1; i <= 100; i++){
            ArrayList<Integer> rigaPiramide = new ArrayList<>();
            int num = i;
            for (int j = 0; j < i; j++){
                num += 2;
                rigaPiramide.add(num);
            }
            numeriDispari.put(i, rigaPiramide);
        }
        System.out.println(numeriDispari.entrySet());
    }*/
    /*public static int rowSumOddNumbers(int n) {
        HashMap<Integer, ArrayList<Integer>> numeriDispari = new HashMap();
        for (int i = 1; i <= 100; i++){
            ArrayList<Integer> rigaPiramide = new ArrayList<>();
            int num = i;
            for (int j = 0; j < i; j++){
                num += 2;
                rigaPiramide.add(num);
            }
            numeriDispari.put(i, rigaPiramide);
        }
        int sum = 0;
        for (Integer numeri: numeriDispari.get(n)){
            for (int numero: numeri){
                sum += numero;
            }
        }
        return sum;
    }*/
    }
}
