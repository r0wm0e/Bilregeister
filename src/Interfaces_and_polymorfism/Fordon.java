package Interfaces_and_polymorfism;

    abstract class Fordon implements Printable {
    public int hastighet, vikt;
    public String ändraHastighet;

    public Fordon(int hastighet, int vikt, String ändraHastighet){
        this.hastighet = hastighet;
        this.vikt = vikt;
        this.ändraHastighet = ändraHastighet;
    }
}
