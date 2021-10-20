package com.company;

import java.util.Random;

public class Osoba {
    private String name;
    private String surname;
    private int age;
    private Random random = new Random();

    public Osoba(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = random.nextInt(99) + 1;
    }

    public Osoba(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
