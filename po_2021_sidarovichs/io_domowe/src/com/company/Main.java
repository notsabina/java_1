package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("ZADANIE 1");
        Generator generator = new Generator();
        ArrayList<Osoba> osobas = generator.generateOsoby();
        BufferedWriter osobaWriter = null;
        try {
            osobaWriter = new BufferedWriter(new FileWriter("osoby.txt"));
            for (Osoba osoba : osobas) {
                osobaWriter.write(osoba.getName() + " " + osoba.getSurname() + " " + osoba.getAge() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                osobaWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("------------------------------\nZADANIE2");
        Scanner osobaReader = new Scanner(new File("osoby.txt"));
        HashMap<String, Integer> namesCounter = new HashMap<>();
        HashMap<String, Integer> surnamesCounter = new HashMap<>();
        HashMap<String, Integer> duplicatesCounter = new HashMap<>();
        ArrayList<Osoba> recreatedOsoby = new ArrayList<>();
        Osoba temp;
        String name;
        String surname;
        int age;
        while (osobaReader.hasNextLine()) {
            name = osobaReader.next();
            surname = osobaReader.next();
            age = osobaReader.nextInt();
            temp = new Osoba(name, surname, age);
            osobaReader.nextLine();
            recreatedOsoby.add(temp);
            if (namesCounter.containsKey(name)) {
                namesCounter.replace(name, namesCounter.get(name) + 1);
            } else {
                namesCounter.put(name, 1);
            }
            if (surnamesCounter.containsKey(surname)) {
                surnamesCounter.replace(surname, surnamesCounter.get(surname) + 1);
            } else {
                surnamesCounter.put(surname, 1);
            }
            if (duplicatesCounter.containsKey(name + " " + surname)) {
                duplicatesCounter.replace(name + " " + surname, duplicatesCounter.get(name + " " + surname) + 1);
            } else {
                duplicatesCounter.put(name + " " + surname, 1);
            }
        }
        System.out.println("------------------------------\nZADANIE 3");
        TreeMap<String, Integer> treeNames = new TreeMap<>(namesCounter);
        TreeMap<String, Integer> surnamesTree = new TreeMap<>(surnamesCounter);
        BufferedWriter sortedWriter = null;
        try{
            sortedWriter = new BufferedWriter(new FileWriter("sortedosoby.txt"));
            sortedWriter.write(treeNames.toString());
            sortedWriter.write("\n");
            sortedWriter.write(surnamesTree.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                sortedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
