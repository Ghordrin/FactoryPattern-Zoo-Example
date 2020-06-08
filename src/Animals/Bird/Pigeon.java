package Animals.Bird;

public class Pigeon extends Bird {
    public static int amountOfPigeonsCreated;

    public Pigeon() {
        amountOfPigeonsCreated += 1;
    }

    @Override
    public boolean edible() {
        return true;
    }

    public static int getAmountOfPigeonsCreated() {
        return amountOfPigeonsCreated;
    }

    @Override
    public boolean domesticated() {
        return true;
    }

    @Override
    public String getName() {
        return "Pigeon";
    }

    @Override
    public String toString() {
        return "Pigeon";
    }
}
