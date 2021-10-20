package com.company;

import obiekty.*;

public class Gornik {
    protected double income;
    protected ObiektKopalniany[][] szyb;

    public Gornik(ObiektKopalniany[][] szyb) {
        this.income = 0;
        this.szyb = szyb;
    }

    protected void goMiner() {
        for (int i = 0; i < this.szyb.length; i++) {
            if (this.szyb[i] != null) {
                for (int j = 0; j < this.szyb[i].length; j++) {
                    this.income += this.szyb[i][j] == null? 0 : this.szyb[i][j].getModifiedMarketValue();
                    this.szyb[i][j] = null;
                }
            }
        }
    }
}
