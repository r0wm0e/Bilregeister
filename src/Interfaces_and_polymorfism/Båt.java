package Interfaces_and_polymorfism;

public class Båt extends Fordon implements Printable {
    int dödvikt;
    String sväng;

    public Båt(int dödvikt, String sväng, int hastighet, int vikt, String ändraHastighet) {
        super(hastighet, vikt, ändraHastighet);
        this.dödvikt = dödvikt;
        this.sväng = sväng;
    }

    public void printMe() {
        System.out.println("Hastighet: " + hastighet + "Vikt: " + vikt + "Ändra Hastighet: " + ändraHastighet +
                "Dödvikt: " + dödvikt + "Sväng: " + sväng);
    }
}
