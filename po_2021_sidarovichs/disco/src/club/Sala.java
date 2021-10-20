package club;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Sala {
    private LinkedHashSet<Uczestnik> participants;
    private int capacity;

    public Sala(int capacity) {
        this.capacity = capacity;
        this.participants = new LinkedHashSet<>();
    }

    public Sala(int capacity, LinkedHashSet<Uczestnik> participants) {
        this.capacity = capacity;
        this.participants = participants;
    }

    public boolean findParticipant(Uczestnik u) {
        return participants.contains(u);
    }

    public void addParticipant(Uczestnik uczestnik) throws TooManyPeopleException{
        if (participants.size() < capacity){
            this.participants.add(uczestnik);
        } else {
            throw new TooManyPeopleException();
        }

    }
}
