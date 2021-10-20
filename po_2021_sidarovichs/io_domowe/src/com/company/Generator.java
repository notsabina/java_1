package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
    private List<String> names = List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J");
    private List<String> surnames = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j");
    private Random rand = new Random();
    public Generator() {
    }

    public ArrayList<Osoba> generateOsoby() {
        ArrayList<Osoba> osoby = new ArrayList<>();
        String name;
        String surname;
        for (int i = 0; i < 1000; i++) {
            name = this.names.get(rand.nextInt(10));
            surname = this.surnames.get(rand.nextInt(10));
            osoby.add(new Osoba(name, surname));
        }
        return osoby;
    }



}
