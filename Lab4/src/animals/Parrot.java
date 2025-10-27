package animals;

public class Parrot extends Animal {
    {
        this.name = "Parrot";
        this.legs = 2;
    }

    public String getDescription() {
        return "A dog named " + name + " with " + legs + " legs.";
    }
}