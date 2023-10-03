package Interfaces_and_polymorfism;

public class Bil extends Fordon implements Printable {

        int antalVäxlar;
        String växla;

        public Bil(int hastighet, int vikt, String ändraHastighet, int antalVäxlar, String växla) {
            super(hastighet, vikt, ändraHastighet);
            this.antalVäxlar = antalVäxlar;
            this.växla = växla;
        }

        public void printMe() {
            System.out.println("Hastighet: " + hastighet + "Vikt: " + vikt + "Ändra Hastighet: " + ändraHastighet +
                    "Antal växlar: " + antalVäxlar + "Växla: " + växla);
        }
    }
