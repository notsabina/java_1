package pl.edu.pw.mini.po.statki;

import java.util.Random;

public class Dzialo {
    private static Random rand = new Random();

    public Dzialo() {
    }

    public void strzal(Plansza plansza) {
        int x = rand.nextInt(100);
        int y = rand.nextInt(100);
        if (plansza.plansza[x][y] != null) {
            plansza.plansza[x][y].ostrzal(plansza, x, y);
        }

    }
}
