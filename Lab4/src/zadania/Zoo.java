package zadania;
import animals.*;
import java.util.Random;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[100];
        Random random = new Random();

        for (int i = 0; i < animals.length; i++) {
            int c = random.nextInt(3);
            if (c == 0) animals[i] = new Dog();
            else if (c == 1) animals[i] = new Parrot();
            else if (c == 2) animals[i] = new Snake();
        }
        int ile = 0;
        for (int i = 0; i < animals.length; i++) {
            ile = ile + animals[i].legs;
        }
        System.out.println("Ilosc nog to " + ile);
    }
}