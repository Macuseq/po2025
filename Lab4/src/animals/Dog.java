package animals;

public class Dog extends Animal {
    {
        this.name = "Dog";
        this.legs = 4;
    }

    public String getDescription() {
        return "A dog named " + name + " with " + legs + " legs.";
    }
}
