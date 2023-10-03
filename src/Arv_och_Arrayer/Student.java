package Arv_och_Arrayer;

public class Student extends Person {
    public Student(String name, int age, int personNr) {
        super(name, age, personNr);
    }

    public String toString() {
        return "namn: " + name + " " + "Ålder: " + age + " " + "PersonNR: " + personNr;
    }
}