package Sprint1.Bilregister;

public class Bil {
    private String registeringsNummer;
    private String modell;
    private String märke;
    private Bilägare ägare;

    public String getRegisteringsNummer() {
        return registeringsNummer;
    }

    public void setRegisteringsNummer(String registeringsNummer) {
        this.registeringsNummer = registeringsNummer;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getMärke() {
        return märke;
    }

    public void setMärke(String märke) {
        this.märke = märke;
    }

    public Bil(String registeringsNummer, String modell, String märke) {
        this.setRegisteringsNummer(registeringsNummer);
        this.setModell(modell);
        this.setMärke(märke);
    }
    public String toString(){
        return "Bilens regnr: " + registeringsNummer + ", Bilens modell: " + modell
                + ", Bilens märke: " + märke;
    }

    public Bilägare getÄgare() {
        return ägare;
    }

    public void setÄgare(Bilägare ägare) {
        this.ägare = ägare;
    }
}
