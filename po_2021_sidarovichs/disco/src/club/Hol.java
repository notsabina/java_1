package club;

import java.util.LinkedList;

public class Hol {
    private LinkedList<Uczestnik> participants;

    public Hol() {
        this.participants = new LinkedList<>();
        for (int i = 0; i < 33; i++) {
            this.participants.add(new Student());
            this.participants.add(new Studentka());
            this.participants.add(new Outsider());
        }
    }

    public LinkedList<Uczestnik> getParticipants() {
        return participants;
    }

    public void addParticipants(Uczestnik participant) {
        this.participants.add(participant);
    }

    public Uczestnik findParticipant(int index) {
        if (index >= 0 && index < participants.size()) {
            return this.participants.get(index);
        } else {
            return null;
        }
    }
}
