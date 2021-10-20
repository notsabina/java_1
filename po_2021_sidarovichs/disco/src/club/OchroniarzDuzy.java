package club;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class OchroniarzDuzy extends OchroniarzMaly{
    private HashMap<String, HashSet<Outsider>> outsiders;
    public OchroniarzDuzy(Dyskoteka disco) {
        super(disco);
        this.outsiders = new HashMap<>();
        createMap();
    }

    private void createMap() {
        String[] names =  new String[] {"A", "B", "C", "D", "E", "F", "J", "H", "I", "J"};
        for (String name : names) {
            this.outsiders.put(name, new HashSet<>());
        }
    }

    public boolean canBeAdded(Outsider o) {
        return !this.outsiders.containsValue(o);
    }

    public void printStrangers(){
        System.out.println(Arrays.asList(this.outsiders));
    }

    @Override
    public boolean check(Uczestnik u) {
        if (u.getAge() < 18) {
            return false;
        } else {
            try {
                Random rand = new Random();
                if (rand.nextBoolean()) {
                    disco.getSalaDuza().addParticipant(u);
                }
                else {
                    disco.getSalaMala().addParticipant(u);
                }
                return true;
            } catch (TooManyPeopleException e) {
                System.out.println("Too many people!");
                return false;
            }
        }
    }
}
