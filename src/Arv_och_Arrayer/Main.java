package Arv_och_Arrayer;

import java.util.Arrays;

public class Main {

    Student s1 = new Student("Oskar", 33, 900416 - 1536);
    Student s2 = new Student("Sofia", 30, 930415 - 1623);
    Student s3 = new Student("Baku", 40, 830415 - 1827);

    Lärare l1 = new Lärare("Kalle", 40, 830201 - 2728);

    Kurs kurs = new Kurs("Javautveckling", l1);

    Student[] s = {s1, s2, s3};

  /*  for(Student  : s){
        System.out.println(student.name);
    }



    public Main(){
            System.out.println(s);

    }


    public static void main(String[] args) {
        Main m = new Main();
    }

   */
}

