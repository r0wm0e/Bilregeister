package Sprint1.Fordon;

public class Main {

    Bil bil1 = new Bil (100, 1500, "120" , 6 , "Växel 5");
    Båt båt1 = new Båt(3000, "Svänger nu vänster ", 10,4000,"20");
    Cykel cykel1 = new Cykel(10, 20, "50", 5, 5, "Växel 4");
    Tåg tåg1 = new Tåg(40, 8000, "70", 10, "Kopplar på en vagn till");
    public Main(){
        System.out.println(bil1);
        System.out.println(båt1);
        System.out.println(cykel1);
        System.out.println(tåg1);
    }



    public static void main(String[] args) {
        Main m = new Main();
    }
}
