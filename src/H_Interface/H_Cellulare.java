package H_Interface;

import java.util.HashMap;
import java.util.SortedMap;

public class H_Cellulare implements iTelefono{
    private int mioNumero;
    private boolean staSuonando;
    private boolean acceso = false;

    public H_Cellulare(int mioNumero) {
        this.mioNumero = mioNumero;
    }

    @Override
    public void accendi() {
        this.acceso = true;
        System.out.println("Il cellulare ora è acceso");
    }

    @Override
    public void componiNumero(int numeroTelefono) {
        if (acceso){
            System.out.println("Sta suonando" + numeroTelefono + " sul cellulare");
        } else {
            System.out.println("Cliente non raggiungibile o telefono spento");
        }

    }

    @Override
    public void rispondi() {
        if (staSuonando){
            System.out.println("Sta suonando");
            this.staSuonando = false;
        }
    }

    @Override
    public boolean chiamaTelefono(int numeroTelefono) {
        if (numeroTelefono == mioNumero && acceso){
            staSuonando = true;
            System.out.println("Suoneria personalizzata cellulare");
        } else {
            System.out.println("Telefono spento o numero sbagliato");
        }
        return staSuonando;
    }

    @Override
    public boolean staSuonando() {
        return staSuonando;
    }

    public HashMap rubrica (){
        HashMap<Integer, String> rubrica = new HashMap<>();
        rubrica.put(111333, "Anno");
        rubrica.put(664333, "Miyaz");
        rubrica.put(40404, "Obata");
        rubrica.put(123456, "Beba");

        return rubrica;
    }

    public boolean riceviChiamata (int numeroTelefono){
        HashMap<Integer, String> rubrica = rubrica();
        if (acceso){
            if (rubrica.containsKey(numeroTelefono)){
                System.out.println("Chiamata da "+ rubrica.get(numeroTelefono));
            } else {
                System.out.println("Chiamata in arrivo da Numero Sconosciuto: " + numeroTelefono);
            }
        } else {
            System.out.println("Utente non raggiungibile");
        }
        return staSuonando;
    }
}
