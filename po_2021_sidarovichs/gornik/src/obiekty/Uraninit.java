package obiekty;


import java.util.Random;

public class Uraninit extends ObiektKopalniany{
    private enum formy {uranofan, torbernit, foumarieryt}
    private String forma;
    private int radioaktywnosc;
    Random rand = new Random();

    public Uraninit(double wartoscRynkowa) {
        super(wartoscRynkowa);
        this.forma = formy.values()[rand.nextInt(3)].toString();
        this.radioaktywnosc = rand.nextInt(251) + 700;
    }

    @Override
    public double getModifiedMarketValue() {
        return switch (this.forma) {
            case ("uranofan") -> this.wartoscRynkowa;
            case ("torbernit") -> this.wartoscRynkowa * 1.5;
            case ("foumarieryt") -> this.wartoscRynkowa * 2.5;
            default -> this.wartoscRynkowa;
        };
    }

    @Override
    public String toString() {
        return String.valueOf(wartoscRynkowa);
    }
}
