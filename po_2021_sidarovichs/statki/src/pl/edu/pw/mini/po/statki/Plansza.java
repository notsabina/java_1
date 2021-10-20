package pl.edu.pw.mini.po.statki;

import pl.edu.pw.mini.po.statki.statek.Okret;

public class Plansza {
    public Okret[][] plansza = new Okret[100][100];

    Plansza() {
    }

    public boolean checkIfAvailable(int x, int y) {
        return this.plansza[x][y] == null;
    }

    public void createShip(int x, int y, Okret okret) {
        if (this.checkIfAvailable(x, y)) {
            this.plansza[x][y] = okret;
        }

    }
}