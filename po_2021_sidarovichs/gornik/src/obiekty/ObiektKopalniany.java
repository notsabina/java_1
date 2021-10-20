package obiekty;

import com.company.MineryObjectEvaluator;

public class ObiektKopalniany implements MineryObjectEvaluator {
    protected double wartoscRynkowa;

    public ObiektKopalniany(double wartoscRynkowa) {
        this.wartoscRynkowa = wartoscRynkowa;
    }

    public ObiektKopalniany() {
        this.wartoscRynkowa = 1;
    }

    public double getWartoscRynkowa() {
        return wartoscRynkowa;
    }

    @Override
    public String toString() {
        return String.valueOf(wartoscRynkowa);
    }
}
