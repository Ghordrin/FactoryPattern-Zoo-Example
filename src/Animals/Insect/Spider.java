package Animals.Insect;

public class Spider extends Insect {
    public static int amountOfSpidersCreated;

    public Spider() {
        amountOfSpidersCreated += 1;
    }

    public static int getAmountOfSpidersCreated() {
        return amountOfSpidersCreated;
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
        return "Spider";
    }
}
