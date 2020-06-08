package Animals.Bird;

public class Eagle extends Bird {
    public static int amountOfEaglesCreated;

    public Eagle() {
        amountOfEaglesCreated += 1;
    }

    public static int getAmountOfEaglesCreated() {
        return amountOfEaglesCreated;
    }

    @Override
    public String toString() {
        return "Eagle";
    }

    @Override
    public String getName() {
        return "Eagle";
    }
}
