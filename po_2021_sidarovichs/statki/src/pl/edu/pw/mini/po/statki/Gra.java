package pl.edu.pw.mini.po.statki;

import java.util.Random;
import pl.edu.pw.mini.po.statki.statek.Fregata;
import pl.edu.pw.mini.po.statki.statek.Korweta;
import pl.edu.pw.mini.po.statki.statek.Niszczyciel;
import pl.edu.pw.mini.po.statki.statek.Okret;

public class Gra implements Rozgrywka {
    private static final Random rand = new Random();
    public Dzialo dzialo = new Dzialo();
    public Plansza plansza = new Plansza();

    public void graj(int liczbaTur) {
        for(int i = 1; i <= liczbaTur; ++i) {
            System.out.println("\nTura nr " + i + "\n");

            for(int j = 0; j < 10; ++j) {
                this.dzialo.strzal(this.plansza);
            }
        }

    }

    public void widok() {
        Okret[][] var1 = this.plansza.plansza;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Okret[] ships = var1[var3];
            Okret[] var5 = ships;
            int var6 = ships.length;

            for(int var7 = 0; var7 < var6; ++var7) {
                Okret ship = var5[var7];
                if (ship != null) {
                    System.out.print(ship.getSymbol());
                } else {
                    System.out.print("~");
                }
            }

            System.out.println();
        }

    }

    private void generatorOkretow(Typ typ, int liczba) {
        int i = 0;
        int x;
        int y;
        switch(typ) {
            case Fregata:
                while(i < liczba) {
                    x = rand.nextInt(100);
                    y = rand.nextInt(100);
                    if (this.plansza.checkIfAvailable(x, y)) {
                        this.plansza.createShip(x, y, new Fregata(new int[]{x, y}));
                        ++i;
                    }
                }

                return;
            case Niszczyciel:
                while(i < liczba) {
                    x = rand.nextInt(100);
                    y = rand.nextInt(100);
                    if (this.plansza.checkIfAvailable(x, y)) {
                        this.plansza.createShip(x, y, new Niszczyciel(new int[]{x, y}));
                        ++i;
                    }
                }

                return;
            case Korweta:
                while(i < liczba) {
                    x = rand.nextInt(100);
                    y = rand.nextInt(100);
                    if (this.plansza.checkIfAvailable(x, y)) {
                        this.plansza.createShip(x, y, new Korweta(new int[]{x, y}));
                        ++i;
                    }
                }
        }

    }

    private void inicjalizuj(int liczbaNiszczycieli, int liczbaFregat, int liczbaKorwet) {
        this.generatorOkretow(Typ.Niszczyciel, liczbaNiszczycieli);
        this.generatorOkretow(Typ.Korweta, liczbaKorwet);
        this.generatorOkretow(Typ.Fregata, liczbaFregat);
    }

    public Gra(int liczbaNiszczycieli, int liczbaFregat, int liczbaKorwet) {
        this.inicjalizuj(liczbaNiszczycieli, liczbaFregat, liczbaKorwet);
    }

    public Gra() {
        this.inicjalizuj(100, 500, 1000);
    }
}

