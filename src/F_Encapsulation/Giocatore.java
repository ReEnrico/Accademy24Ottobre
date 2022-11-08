package F_Encapsulation;

public class Giocatore {
    public String nome;
    public int salute;
    public String arma;



    public void perditaSalute(int danno){
        this.salute -= danno;
        if (this.salute <= 0){
            System.out.println("Game over");
        }
    }
}
