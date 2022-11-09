import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class TestCodewars {

    //import org.apache.commons.text.WordUtils;

    public static void main(String[] args) {
        String str = "I like eating";
        StringTokenizer token = new StringTokenizer(str);
        LinkedList<String> breakString = new LinkedList<>();
        String reverse= "";
        while(token.hasMoreTokens()){
            System.out.println(token.nextToken());
            //reverse += token.nextToken();
            breakString.add(token.nextToken());
        }
        //System.out.println(breakString);
        for (int i = breakString.size(); i < 0; i--){
            reverse += breakString.get(i);
        }
        System.out.println(reverse);


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
