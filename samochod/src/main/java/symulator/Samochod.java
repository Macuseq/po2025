package symulator;

public class Samochod {
    private Silnik silnik;
    private SkrzyniaBiegow skrzynia;

    private boolean stanWlaczenia;
    private String nrRejest;
    private String model;
    private int max_predkosc;

    public Samochod(Silnik silnik, SkrzyniaBiegow skrzynia, boolean stanWlaczenia, String nrRejest, String model, int max_predkosc) {
        this.silnik = silnik;
        this.skrzynia = skrzynia;
        this.stanWlaczenia = stanWlaczenia;
        this.nrRejest = nrRejest;
        this.model = model;
        this.max_predkosc = max_predkosc;
    }

    public void wlacz(){
        silnik.uruchom();
    }

    public void wylacz() {
        silnik.zatrzymaj();
        if (skrzynia.getAktBieg()!=0) {
            if(skrzynia.getAktBieg()<0) {
                skrzynia.zwiekszBieg();
            }
            else {
                while(skrzynia.getAktBieg()>0) {
                    skrzynia.zmniejszBieg();
                }
            }
        }
    }

}