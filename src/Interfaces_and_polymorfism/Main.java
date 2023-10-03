package Interfaces_and_polymorfism;

public class Main implements Printable{

    Bil bil1 = new Bil(100, 1500, "120" , 6 , "Växel 5");
    Båt båt1 = new Båt(3000, "Svänger nu vänster ", 10,4000,"20");
    Cykel cykel1 = new Cykel(10, 20, "50", 5, 5, "Växel 4");
    Tåg tåg1 = new Tåg(40, 8000, "70", 10, "Kopplar på en vagn till");
    public Main(){
        bil1.printMe();
        båt1.printMe();
        cykel1.printMe();
        tåg1.printMe();
    }

    public static void main(String[] args) {
        Main m = new Main();
    }
    @Override
    public void printMe() {

    }
}
