package Interfaces_and_polymorfism;

public class Cykel extends Fordon implements Printable {
    int antalVäxlar, växelJustNu;
    String växla;

    public Cykel(int hastighet, int vikt, String ändraHastighet, int antalVäxlar, int växelJustNu, String växla) {
        super(hastighet, vikt, ändraHastighet);
        this.antalVäxlar = antalVäxlar;
        this.växelJustNu = växelJustNu;
        this.växla = växla;
    }

    public void printMe() {
        System.out.println("Hastighet: " + hastighet + "Vikt: " + vikt + "Ändra Hastighet: " + ändraHastighet +
                "Antal växlar: " + antalVäxlar + "Växel just nu: " + växelJustNu + "Växla: " + växla);
    }
}