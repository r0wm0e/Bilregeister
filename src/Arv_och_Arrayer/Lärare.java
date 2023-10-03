package Arv_och_Arrayer;

public class Lärare extends Person{
    public Lärare(String name, int age, int persoNr){
        super(name, age, persoNr);
    }
    public String toString(){
        return "namn: " + name + " " + "Ålder: " + age + " " + "PersonNR: " + personNr;
    }
}
