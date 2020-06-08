package Animals.Bird;

public class Chicken extends Bird {
    public static int amountOfChickensCreated;

    public Chicken(){
        amountOfChickensCreated+=1;
    }

    public static int getAmountOfChickensCreated() {
        return amountOfChickensCreated;
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public boolean domesticated() {
        return true;
    }

    @Override
    public boolean edible() {
        return true;
    }

    @Override
    public String getName() {
        return "Chicken";
    }
}
