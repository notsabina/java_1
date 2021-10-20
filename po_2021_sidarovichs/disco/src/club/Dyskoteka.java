package club;

import java.util.Random;

public class Dyskoteka {
    private Hol hol;
    private Sala salaMala;
    private Sala salaDuza;
    private OchroniarzMaly ochroniarzMaly;
    private OchroniarzDuzy ochroniarzDuzy;
    private Random rand = new Random();

    public Dyskoteka() {
        this.hol = new Hol();
        this.salaMala = new Sala(51);
        this.salaDuza = new Sala(75);
        this.ochroniarzMaly = new OchroniarzMaly(this);
        this.ochroniarzDuzy = new OchroniarzDuzy(this);
    }

    public Hol getHol() {
        return hol;
    }

    public Sala getSalaMala() {
        return salaMala;
    }

    public Sala getSalaDuza() {
        return salaDuza;
    }

    public void inviteAll() {
        for (Uczestnik uczestnik : this.hol.getParticipants()) {
            if (rand.nextBoolean()) {
                if (ochroniarzDuzy.check(uczestnik)) {
                    this.hol.getParticipants().remove(uczestnik);
                }
            }
            else  {
                if (ochroniarzMaly.check(uczestnik)) {
                    this.hol.getParticipants().remove(uczestnik);
                }
            }
        }
    }
}
