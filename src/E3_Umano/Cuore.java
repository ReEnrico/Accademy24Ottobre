package E3_Umano;

public class Cuore {
    private int numeroArterie;
    private String saluteCuore;

    public Cuore(int numeroArterie, String saluteCuore) {
        this.numeroArterie = numeroArterie;
        this.saluteCuore = saluteCuore;
    }

    public int getNumeroArterie() {
        return numeroArterie;
    }

    public String getSaluteCuore() {
        return saluteCuore;
    }

    public void statoCuore(int arterie, String salute){
        if(arterie >= 4 && salute.equalsIgnoreCase("ottimo")){
            System.out.println("Bene, sei in perfetta forma");
        }else {
            System.out.println("Meglio farsi controllare da un dottore");
        }
    }
}
