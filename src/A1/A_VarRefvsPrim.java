package A1;

import java.awt.*;

public class A_VarRefvsPrim {
    public static void main(String[] args) {
        // gestione della memoria: la primitiva contiene sia il nome che il valore; la reference contiene la memoria e il valore in due luoghi diversi
        int x = 1;
        int y = x;// qui รจ primitive
        x = 2;//aggiorno
        System.out.println(x + " " + y);

        Point unPunto = new Point(1, 2);
        Point unSecondoPunto = unPunto;
        unPunto.x = 8;
        System.out.println(unPunto);
        System.out.println(unSecondoPunto);

        String frase = "Lunga frase";
        System.out.println(frase);
    }
}
