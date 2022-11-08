package H_Interface;

public class H_TelefonoFIsso implements iTelefono{

    private int mioNumero;
    private boolean staSuonando;

    public H_TelefonoFIsso(int mioNumero) {
        this.mioNumero = mioNumero;
    }

    @Override
    public void accendi() {
        System.out.println("Il telefono fisso è sempre funzionante.");
    }

    @Override
    public void componiNumero(int numeroTelefono) {
        System.out.println("Sta suonando " + numeroTelefono + " su telefono fisso.");
    }

    @Override
    public void rispondi() {
        if (staSuonando){
            System.out.println("Rispondo al telefono");
            this.staSuonando = false;
        }
    }

    @Override
    public boolean chiamaTelefono(int numeroTelefono) {
        if (numeroTelefono == mioNumero) {
            staSuonando = true;
            System.out.println("Driiin drin");
        } else {
            staSuonando = false;
        }
        return staSuonando;
    }

    @Override
    public boolean staSuonando() {
        return false;
    }
}
