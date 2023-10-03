package Sprint1.Bilregister;

public class Main {


        Person person = new Person("Jakob Andersson", "Bivägen 22", 40);
        Person p1 = new Person("Ralf ","Bivägen 93. ", 33);
        Bil bil = new Bil("DEF 456 ", "x10 ", "BMW ");
        Bilägare bilägare = new Bilägare("Kalle Jakobsson" , "Stocksund " , 68);


        Main () {

            System.out.println(person);

            System.out.println(p1);

            System.out.println(bilägare);

            System.out.println(bil);
        }

    public static void main(String[] args) {
        Main m = new Main();

    }
}