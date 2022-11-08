package H_Interface;

public class Main {
    public static void main(String[] args) {
        iTelefono telefono = new H_TelefonoFIsso(390998993);

        H_Cellulare mio = new H_Cellulare(3746503);

        mio.accendi();
        mio.riceviChiamata(111333);
        mio.riceviChiamata(2334564);
    }
}
