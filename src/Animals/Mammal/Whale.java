package Animals.Mammal;

public class Whale extends Mammal {
    public static int amountOfWhalesCreated;

    public Whale() {
        amountOfWhalesCreated += 1;
    }

    public static int getAmountOfWhalesCreated() {
        return amountOfWhalesCreated;
    }

    @Override
    public String toString() {
        return "Whale: #" + amountOfWhalesCreated;
    }


    @Override
    public String getName() {
        return "Whale";
    }
}
