package club;

import java.util.Random;

public abstract class Uczestnik {
    private static String[] names = new String[] {"A", "B", "C", "D", "E", "F", "J", "H", "I", "J"};
    private static String[] surnames = new String[] {"A", "B", "C", "D", "E", "F", "J", "H", "I", "J"};
    private int unikalneId;
    private static int counter = 0;
    private String name;
    private String surname;
    private int age;
    private Random rand = new Random();

    public Uczestnik(int lower, int upper) {
        this.unikalneId = counter++;
        this.name = names[rand.nextInt(10)];
        this.surname = surnames[rand.nextInt(10)];
        this.age = rand.nextInt(upper - lower) + lower + 1;
    }

    public static boolean equals(Uczestnik a, Uczestnik b){
        return a.unikalneId == b.unikalneId;
    }

    public int getAge() {
        return age;
    }

    public int getUnikalneId() {
        return unikalneId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
