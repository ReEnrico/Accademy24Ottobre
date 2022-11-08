package A1;

public class A_Variable {
    public static void main(String[] args) {
        System.out.println("Hello people!");
        int x = 23;
        System.out.println(x);
        /* primitivi: int byte short long double float boolean char*/
        int primoNumero;
        primoNumero= 10; // dichiarazione disgiunta: dichiarazione e valorizzazione
        int secondoNumero = 12; // dichiarazione congiunta

        double grossoNumero = 33.999;// virgola mobile
        float normaleNumero;// virgola mobile
        char lettera = 'k';
        System.out.println(lettera);
        boolean check = true;
        System.out.println("Il valore che hai scelto è " + check);
        //short primoLong = 908_743_654;
        /* Wrapped Classes: Primitive and Reference (advanced version of primitive, ex. char vs string)*/
        int maxInteger = Integer.MAX_VALUE;// Integer is a wrapped class for the int type
        int minInteger = Integer.MIN_VALUE;
        System.out.println("Integer max and min values: " + maxInteger + " " + minInteger);

        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;
        System.out.println("Byte max and min values: " + maxByte + " " + minByte);

        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MIN_VALUE;
        System.out.println("Short max and min values: " + maxShort + " " + minShort);

        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        System.out.println("long max and min values: " + maxLong + " " + minLong);

        float maxfloat = Float.MAX_VALUE;
        float minfloat = Float.MIN_VALUE;
        System.out.println("Float max and min values: " + maxfloat + " " + minfloat);

        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        System.out.println("Double max and min values: " + maxDouble + " " + minDouble);

        float big = (float) 34.87;

        /* casting = give a type to a variable
         * widening casting upgrade the type
         * narrowing casting downgrade the type*/
        int numPiccolo = 9;
        double unNumero = numPiccolo;
        System.out.println(unNumero);// dal basso all'alto è okay

        double smallDouble = 23.4;
        int fromDouble = (int) smallDouble;// devo forzare la conversione

        String string = "-1.4\" -34!ef(7)\n";
        System.out.println(string.length());
    }
}
