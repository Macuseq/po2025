package animals;

public class Snake extends Animal {
    {
        this.name = "Snake";
        this.legs = 0;
    }

    public String getDescription() {
        return "A dog named " + name + " with " + legs + " legs.";
    }
}
