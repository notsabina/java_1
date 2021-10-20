package com.company;

import obiekty.*;

import java.util.Random;

public class Adit {
    private int maxDistance;
    private int corridorLength;
    private int corridorsNumber;
    private int dlugoscSzybu;
    protected ObiektKopalniany[][] szyb;
    Random rand = new Random();
    Gornik gornik;

    public Adit(int maxDistance, int corridorLength, int corridorsNumber) {
        this.maxDistance = maxDistance;
        this.corridorLength = corridorLength;
        this.corridorsNumber = corridorsNumber;
        this.dlugoscSzybu = (maxDistance + 1) * corridorsNumber;
        this.szyb = new ObiektKopalniany[dlugoscSzybu][corridorLength];
        createSzyb(maxDistance, corridorsNumber);
        this.gornik = new Gornik(szyb);
    }

    public Adit() {
        this.maxDistance = 2;
        this.corridorLength = 5;
        this.corridorsNumber = 10;
        this.dlugoscSzybu = (maxDistance + 1) * corridorsNumber;
        this.szyb = new ObiektKopalniany[dlugoscSzybu][corridorLength];
        createSzyb(maxDistance, corridorsNumber);
        this.gornik = new Gornik(this.szyb);
    }

    private void createSzyb (int maxDistance, int corridorsNumber) {
        int distance = 0;
        double pick;
        for (int i = 0; i < corridorsNumber; i++) {
            distance += rand.nextInt(maxDistance + 1) + 1;
            for (int j = 0; j < corridorLength; j ++) {
                pick = rand.nextDouble();
                double wartosc = 50;
                if (pick < 0.1) {
                    this.szyb[distance][j] = new Uraninit(wartosc);
                } else if (pick < 0.3) {
                    this.szyb[distance][j] = new Chalkolit(wartosc);
                } else {
                    this.szyb[distance][j] = new Skala();
                }
            }
        }
    }

    protected void wypiszSzyb () {
        for (int j = 0; j < this.dlugoscSzybu; j++) {
            if (this.szyb[j] == null) {
                System.out.println(" ");
            } else {
                System.out.print("->");
                for (int i = 0; i < this.corridorLength; i++) {
                    if (szyb[j][i] == null) {
                        System.out.print(" ");
                    } else {
                        System.out.print(szyb[j][i].toString() );
                    }
                }
                System.out.println();
            }
        }
    }

    public void runAdit() {
        this.gornik.goMiner();
        System.out.println("The income of the miner:" + gornik.income);
    }
}
