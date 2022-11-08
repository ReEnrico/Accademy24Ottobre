package A1;

import java.util.Scanner;

/*
Esercizio Calcolo Formula del BMI
La formula del BMI consiste nella divisione del peso di un soggetto adulto,
espresso in chilogrammi (kg), per il quadrato della sua statura espressa in metri (m).
Il calcolo del BMI si basa dunque sull'equazione kg/m2, che più dettagliatamente corrisponde a:
BMI = peso in kg / (statura in metri * statura in metri)
In un individuo (che chiameremo Mario) con statura 1,75 m (175 cm) e peso 70 kg,
l'operazione corretta è:
BMI di Mario = 70 / (1,75)2 = 22,9
In funzione del BMI, la popolazione viene generalmente divisa
arbitrariamente in sette classi di peso:
normopeso, sottopeso, sovrappeso e obesità do vari gradi.
Categoria  BMI range - kg/m2
Sottopeso severo   < 16,5
Sottpeso   da 16,5 a 18,4
Normale    da 18,5 a 24,9
Sovrappeso da 25 a 30
Obesità primo grado    da 30,1 a 34,9
Obesità secondo grado  da 35 a 40
Obesità terzo grado    > 40

Realizza una applicazione che chiede all'utente altezza e peso e calcola il suo BMI.
Nell'output finale scrivi un messaggio tipo questo esempio:
"Il tuo peso è 80, la tua altezza 180, il tuo BMI è 24.69,
Secondo le tabelle sei ritenuto NORMOPESO"
*
* */


public class F_CalcoloBMI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*Inserimento peso*/
        System.out.println("Inserire il peso in kg:");
        double peso = scanner.nextDouble();

        System.out.println("Inserire l'altezza in m:");
        double altezza = scanner.nextDouble();

        double rapporto = peso/(altezza*altezza);
        int temp = (int)(rapporto*100.0);
        double ibm = ((double)temp)/100.0;

        if (ibm > 40){
            System.out.println("Le tue caratteristiche sono: altezza " + altezza + "; peso " + peso + ". Quindi il tuo BMI è: " + ibm + ", quindi sei obesità terzo grado");
        }
        else if (ibm > 35  && ibm <= 40){
            System.out.println("Le tue caratteristiche sono: altezza " + altezza + "; peso " + peso + ". Quindi il tuo BMI è: " + ibm + ", quindi sei obesità secondo grado");
        }
        else if (ibm > 30.1 && ibm <= 34.9){
            System.out.println("Le tue caratteristiche sono: altezza " + altezza + "; peso " + peso + ". Quindi il tuo BMI è: " + ibm + ", quindi sei obesità primo grado");
        }
        else if (ibm >= 25 && ibm <= 30){
            System.out.println("Le tue caratteristiche sono: altezza " + altezza + "; peso " + peso + ". Quindi il tuo BMI è: " + ibm + ", quindi sei sovrappeso");
        }
        else if (ibm >= 18.5 && ibm <= 24.9){
            System.out.println("Le tue caratteristiche sono: altezza " + altezza + "; peso " + peso + ". Quindi il tuo BMI è: " + ibm + ", quindi sei normopeso");
        }
        else if (ibm >= 16.5 && ibm <= 18.4){
            System.out.println("Le tue caratteristiche sono: altezza " + altezza + "; peso " + peso + ". Quindi il tuo BMI è: " + ibm + ", quindi sei sottpeso sottopeso");
        }
        else {
            System.out.println("Le tue caratteristiche sono: altezza " + altezza + "; peso " + peso + ". Quindi il tuo BMI è: " + ibm + ", quindi sei sottpeso severo");
        }

    }
}
