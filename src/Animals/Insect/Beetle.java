package Animals.Insect;

public class Beetle extends Insect {

    public static int amountOfBeetlesCreated;

    public Beetle() {
        amountOfBeetlesCreated += 1;
    }

    public static int getAmountOfBeetlesCreated() {
        return amountOfBeetlesCreated;
    }

    @Override
    public boolean edible() {
        return false;
    }

    @Override
    public boolean canMove() {
        return true;
    }

    @Override
    public boolean domesticated() {
        return false;
    }

    @Override
    public String getName() {
        return "Beetle";
    }
}
