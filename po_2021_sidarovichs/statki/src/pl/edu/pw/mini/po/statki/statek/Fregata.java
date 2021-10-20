package pl.edu.pw.mini.po.statki.statek;

import java.util.Random;

public class Fregata extends Okret {

    private final long numerFregaty;
    private final int liczbaDzial;
    private static int liczbaFregat = 0;

    public Fregata() {
        int var10001 = ++liczbaFregat;
        this.nazwa = "Fregata" + var10001;
        this.numerFregaty = (long)liczbaFregat;
        this.liczbaDzial = 1;
        this.Wytrzymalosc = 3;
    }

    public Fregata(Fregata fregata) {
        super(fregata);
        this.numerFregaty = fregata.numerFregaty;
        this.liczbaDzial = fregata.liczbaDzial;
    }

    public Fregata(int[] pozycja) {
        super("Fregata" + ++liczbaFregat, pozycja, 3);
        Random rand = new Random();
        this.numerFregaty = (long)liczbaFregat;
        this.liczbaDzial = rand.nextInt(6) + 1;
    }
}
