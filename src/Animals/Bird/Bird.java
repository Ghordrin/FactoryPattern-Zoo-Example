package Animals.Bird;

import Animals.Animal;

public abstract class Bird implements Animal, CanFly {
    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public boolean domesticated() {
        return false;
    }

    @Override
    public boolean edible() {
        return false;
    }

    @Override
    public boolean canMove() {
        return true;
    }
}
