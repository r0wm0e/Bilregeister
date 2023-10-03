package Interfaces_and_polymorfism;

 class Tåg extends Fordon implements Printable {
    int antalVagnar;
    String kopplaVagn;

    public Tåg(int hastighet, int vikt, String ändraHastighet, int antalVagnar, String kopplaVagn) {
        super(hastighet, vikt, ändraHastighet);
        this.antalVagnar = antalVagnar;
        this.kopplaVagn = kopplaVagn;
    }

    public void printMe() {
        System.out.println("Hastighet: " + hastighet + "Vikt: " + vikt + "Ändra Hastighet: " + ändraHastighet +
                "Antal vagnar: " + antalVagnar + "Koppla vagn: " + kopplaVagn);
    }
}
