package pl.edu.pw.mini.po.statki.statek;

import java.util.Random;

public class Korweta extends Okret {
    private final long numerKorwety;
    private final int liczbaBomb;
    private static int liczbaKorwet = 0;

    public Korweta() {
        int var10001 = ++liczbaKorwet;
        this.nazwa = "Korweta" + var10001;
        this.numerKorwety = (long)liczbaKorwet;
        this.liczbaBomb = 1;
        this.Wytrzymalosc = 1;
    }

    public Korweta(Korweta korweta) {
        super(korweta);
        this.numerKorwety = korweta.numerKorwety;
        this.liczbaBomb = korweta.liczbaBomb;
    }

    public Korweta(int[] pozycja) {
        super("Korweta" + ++liczbaKorwet, pozycja, 1);
        Random rand = new Random();
        this.numerKorwety = (long)liczbaKorwet;
        this.liczbaBomb = rand.nextInt(4) + 1;
    }
}
