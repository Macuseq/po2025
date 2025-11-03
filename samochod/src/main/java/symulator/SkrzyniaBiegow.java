package symulator;

public class SkrzyniaBiegow extends Sprzeglo{
    private int aktualnyBieg;
    private final int iloscBiegow=5;

    public SkrzyniaBiegow(String nazwa, double waga, double cena) {
        super(nazwa, waga, cena);
        this.aktualnyBieg=0;
    }

    public void zwiekszBieg() {
        if (aktualnyBieg<iloscBiegow) {
            aktualnyBieg++;
        }
    }

    public void zmniejszBieg() {
        if (aktualnyBieg>-1) {
            aktualnyBieg--;
        }
    }

    public int getAktBieg() {
        return aktualnyBieg;
    }
}
