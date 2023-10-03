package Arv_och_Arrayer;

import java.sql.Array;
import java.util.ArrayList;

public class Kurs {
    String kursnamn;
    Lärare lärare;

    public Kurs(String kursNamn, Lärare lärare) {
        this.kursnamn = kursNamn;
        this.lärare = lärare;
    }

    public String toString() {
        return "Kursens namn: " + kursnamn + " " + "\nKursens lärare: " + lärare;
    }
}