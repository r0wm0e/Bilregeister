package Sprint1.Fordon;

    public class Bil extends Fordon{

        int antalVäxlar;
        String växla;

        public Bil(int hastighet, int vikt, String ändraHastighet, int antalVäxlar, String växla) {
            super(hastighet, vikt, ändraHastighet);
            this.antalVäxlar = antalVäxlar;
            this.växla = växla;
        }

        public String toString(){
            return "Bilens hastighet: " + hastighet + ", Bilens vikt: " + vikt
                    + ", Bilen ändrar hastighet " + ändraHastighet + ", Bilens antal växlar: "
                    + antalVäxlar + ", Bilen växel: " + växla;
        }
    }
