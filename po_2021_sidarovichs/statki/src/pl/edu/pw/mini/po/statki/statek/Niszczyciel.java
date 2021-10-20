package pl.edu.pw.mini.po.statki.statek;

import java.util.Random;

public class Niszczyciel extends Okret {
    private final long numerNiszczyciela;
    private static int liczbaNiszczycieli = 0;
    private final int liczbaRakiet;

    public Niszczyciel() {
        int var10001 = ++liczbaNiszczycieli;
        this.nazwa = "Niszczyciel" + var10001;
        this.numerNiszczyciela = (long)liczbaNiszczycieli;
        this.liczbaRakiet = 1;
        this.Wytrzymalosc = 1;
    }

    public Niszczyciel(Niszczyciel niszczyciel) {
        super(niszczyciel);
        this.numerNiszczyciela = niszczyciel.numerNiszczyciela;
        this.liczbaRakiet = niszczyciel.liczbaRakiet;
    }

    public Niszczyciel(int[] pozycja) {
        super("Niszczyciel" + ++liczbaNiszczycieli, pozycja, 1);
        Random rand = new Random();
        this.numerNiszczyciela = (long)liczbaNiszczycieli;
        this.liczbaRakiet = rand.nextInt(20) + 1;
    }
}
