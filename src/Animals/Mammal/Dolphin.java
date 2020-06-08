package Animals.Mammal;

public class Dolphin extends Mammal {
    public static int amountOfDolphins;

    public Dolphin() {
        amountOfDolphins += 1;
    }


    public static int getAmountOfDolphins() {
        return amountOfDolphins;
    }

    @Override
    public String toString() {
        return "Dolphin";
    }

    @Override
    public String getName() {
        return "Dolphin";
    }
}
