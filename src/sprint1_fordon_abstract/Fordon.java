package sprint1_fordon_abstract;

    public abstract class Fordon {
    public int hastighet, vikt;
    public String ändraHastighet;

    public Fordon(int hastighet, int vikt, String ändraHastighet){
        this.hastighet = hastighet;
        this.vikt = vikt;
        this.ändraHastighet = ändraHastighet;
    }
    public Fordon(){}
        public abstract String toString(); // En abstract metod kan inte ha en "Kropp" {}

}
