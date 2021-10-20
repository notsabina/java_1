package club;

import java.util.Random;

public class OchroniarzMaly {
    protected Dyskoteka disco;
    private Random rand = new Random();
    public OchroniarzMaly(Dyskoteka disco) {
        this.disco = disco;
    }

    public boolean check(Uczestnik u){
        if (u.getAge() < 18) {
            return false;
        } else {
            try {
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
