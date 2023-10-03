package Sprint1.Fordon;

public class Cykel extends Fordon{
    int antalVäxlar, växelJustNu;
    String växla;

    public Cykel(int hastighet, int vikt, String ändraHastighet, int antalVäxlar, int växelJustNu, String växla){
        super(hastighet, vikt, ändraHastighet);
        this.antalVäxlar = antalVäxlar;
        this.växelJustNu = växelJustNu;
        this.växla = växla;
    }
    public String toString(){
        return "Cykelns hastighet: " + hastighet + ", Cykelns vikt: " + vikt
                + ", Cykeln ändrar hastighet " + ändraHastighet + ", Cykeln antal växlar: "
                + antalVäxlar + ", Cykelns växel: " + växla;
    }
}
