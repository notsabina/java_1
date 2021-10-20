package com.company;

import pl.edu.pw.mini.po.statki.Gra;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Gra gra = new Gra();
        gra.graj(10);
        gra.widok();
    }
}
