package Instrument;

public enum keyName {
    C("C"),
    DFLAT("Db"),
    D("D"),
    EFLAT("Eb"),
    E("E"),
    F("F"),
    GFLAT("Gb"),
    G("G"),
    AFLAT("Ab"),
    A("A"),
    BFLAT("Bb"),
    B("B");

    private String name;

    keyName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
