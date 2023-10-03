package Enums_och_TDD;

public enum asdasd { //asdasd = RomerskaSiffror
    I(1,"ett"),V(5, "fem"),X(10, "tio"),C(50, "femtio"),M(1000, "ettTusen"),L(100, "etthundra");

    public int numericVal;
    public String stringVal;

    private asdasd(int i, String s){
        numericVal = i;
        stringVal = s;
    }
}
