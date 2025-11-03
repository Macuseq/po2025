package symulator;

public class Silnik extends Komponent {
    private int obroty;
    private final int max_obroty=7000;

    public Silnik(String nazwa, double waga, double cena) {
        super(nazwa, waga, cena);
        this.obroty=0;
    }

    public void zwiekszObroty () {
        if (obroty<max_obroty) {
            obroty=obroty + 100;
        }
        else {
            obroty=max_obroty;
        }
    }

    public void zmniejszObroty() {
        if (obroty>0) {
            obroty=obroty - 100;
        }
        else {
            obroty=0;
        }
    }

    public void uruchom() {
        obroty=1000;
    }

    public void zatrzymaj() {
        obroty=0;
    }
}