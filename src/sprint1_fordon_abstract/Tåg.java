package sprint1_fordon_abstract;

class Tåg extends Fordon {
    int antalVagnar;
    String kopplaVagn;

    public Tåg(int hastighet, int vikt, String ändraHastighet, int antalVagnar, String kopplaVagn){
        super(hastighet, vikt, ändraHastighet);
        this.antalVagnar = antalVagnar;
        this.kopplaVagn = kopplaVagn;
    }
    public String toString(){
        return "Tågets hastighet: " + hastighet + ", Tågets vikt: " + vikt
                + ", Tåget ändrar hastighet " + ändraHastighet + ", Tågets antal vagnar: "
                + antalVagnar + ", Tågets kopplar på: " + kopplaVagn;
    }
}
