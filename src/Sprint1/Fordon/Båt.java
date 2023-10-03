package Sprint1.Fordon;

public class Båt extends Fordon{
    int dödvikt;
    String sväng;

    public Båt(int dödvikt, String sväng, int hastighet, int vikt, String ändraHastighet){
        super(hastighet, vikt, ändraHastighet);
        this.dödvikt = dödvikt;
        this.sväng = sväng;
    }
    public String toString(){
        return "Dödvikt: " + dödvikt + ", Svänger: " + sväng + ", Hastigthet: "
                + hastighet + ", Vikt: " + vikt + ", Ändrar hastigthet: " + ändraHastighet;
    }
}
