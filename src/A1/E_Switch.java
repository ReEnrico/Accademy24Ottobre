package A1;

public class E_Switch {
    public static void main(String[] args) {
        // alternativa a if else

        String temperatura = "ottimale";
        String messaggio;

        switch (temperatura){
            case "caldo":
                messaggio = "spogliati";
                break;
            case "freddo":
                messaggio = "vestiti";
                break;
            case "ottimale":
                messaggio = "Non devi fare niente";
                break;
            default:
                messaggio = "scegli te cosa fare";
        }
        System.out.println(messaggio);;

        String stringa = "hola";
        switch (stringa){
            case "ciao" -> messaggio = "era ciao";
            case "bau" -> messaggio = "era bau";
            case "bubu" -> messaggio = "era bubu";
            default -> messaggio = "nessuna informazione";
        }
        System.out.println(messaggio);
    }
}
