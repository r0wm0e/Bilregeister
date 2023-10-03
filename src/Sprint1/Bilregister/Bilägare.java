package Sprint1.Bilregister;

public class Bilägare extends Person{
    public Bilägare(String namn, String adress, int ålder){
        super(namn,adress,ålder);
    }
    public String toString(){
        return "Bilägares namn: " + getNamn() + ", Bilägares adress: " + getAdress()
                + ", Bilägares ålder: " + getÅlder();
    }
}
