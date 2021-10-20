package obiekty;

import java.util.Random;

public class Chalkolit extends ObiektKopalniany{
    private int radioaktywnosc;
    Random rand = new Random();

    public Chalkolit(double wartoscRynkowa) {
        super(wartoscRynkowa);
        this.radioaktywnosc =  rand.nextInt(251) + 700;
    }

    @Override
    public double getModifiedMarketValue() {
        return this.wartoscRynkowa;
    }

    @Override
    public String toString() {
        return String.valueOf(wartoscRynkowa);
    }
}
