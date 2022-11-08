package A1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class S_Date {
    public static void main(String[] args) {
        LocalDate dataOggi = LocalDate.now();
        /*Stile apache*/
        System.out.println(dataOggi);
        LocalTime oraOra = LocalTime.now();
        System.out.println(oraOra);
        LocalDateTime tutto = LocalDateTime.now();
        /*è stringa*/
        System.out.println(tutto);
        /* Formattare in modo diverso la data*/
       /* DateTimeFormatter miaForma = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataFormattata = tutto.format(miaForma);
        System.out.println(dataFormattata);*/
        DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("kk:mm:ss dd-MMM-YYYY GG (w - D)");
        String newDate = tutto.format(dataFormat);
        System.out.println(newDate);
    }
}
