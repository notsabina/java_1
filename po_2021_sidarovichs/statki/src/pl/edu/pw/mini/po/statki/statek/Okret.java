package pl.edu.pw.mini.po.statki.statek;

import pl.edu.pw.mini.po.statki.Plansza;

public abstract class Okret {
    protected String nazwa;
    private static long liczbaOkretow = 1L;
    protected int Wytrzymalosc;
    protected int liczbaTrafien;
    protected int[] pozycja;
    protected long numerOkretu;

    public Okret() {
        this.numerOkretu = (long)(liczbaOkretow++);
        this.nazwa = "Statek" + this.numerOkretu;
        this.Wytrzymalosc = 0;
        this.liczbaTrafien = 0;
        this.pozycja = new int[]{0, 0};
    }

    public Okret(Okret okret) {
        this.numerOkretu = okret.numerOkretu;
        this.nazwa = okret.nazwa;
        this.Wytrzymalosc = okret.Wytrzymalosc;
        this.pozycja = okret.pozycja;
        this.liczbaTrafien = okret.liczbaTrafien;
    }

    public Okret(String nazwa, int[] pozycja, int wytrzymalosc) {
        this.numerOkretu = (long)(liczbaOkretow++);
        this.pozycja = pozycja;
        this.liczbaTrafien = 0;
        this.nazwa = nazwa;
        this.Wytrzymalosc = wytrzymalosc;
    }

    public void ostrzal(Plansza plansza, int x, int y) {
        ++this.liczbaTrafien;
        if (this.Wytrzymalosc == this.liczbaTrafien) {
            System.out.println("Okręt " + this.nazwa + " został trafiony i ZATOPIONY");
            plansza.plansza[x][y] = null;
        } else {
            System.out.println("Okręt " + this.nazwa + " został trafiony");
        }

    }

    public String getSymbol() {
        return this.nazwa.substring(0, 1);
    }
}