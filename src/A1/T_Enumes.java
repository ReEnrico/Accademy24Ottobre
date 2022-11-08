package A1;

public class T_Enumes {
    public static void main(String[] args) {
        /* è una classe (METACLASSE) che rappresenta un gruppo di costanti
        * esempio devo fare una lista di province e queste sono un qualcosa che non cambia mai*/
        enum GiorniSettimana {
            LUNEDI,
            MARTEDI,
            MERCOLEDI,
            GIOVEDI,
            VENERDI,
            SABATO,
            DOMENICA
        }
        GiorniSettimana oggi = GiorniSettimana.GIOVEDI;
        System.out.println(oggi);

        switch (oggi) {
            case LUNEDI -> System.out.println("Oggi è lunedì");
            case MARTEDI -> System.out.println("Oggi è martedì");
            case MERCOLEDI -> System.out.println("Oggi è mercoledì");
            case GIOVEDI -> System.out.println("Oggi è giovedì");
            case VENERDI -> System.out.println("Oggi è venerdì");
            case SABATO -> System.out.println("Oggi è sabato");
            case DOMENICA -> System.out.println("Oggi è domenica");
        }
        for (GiorniSettimana giorniSettimana: GiorniSettimana.values()) {
            System.out.println(giorniSettimana);
        }
    }
}
