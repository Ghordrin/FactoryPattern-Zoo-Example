package Animals.Mammal;

import Animals.Animal;

public abstract class Mammal implements Animal,CanSwim {
    @Override
    public boolean canSwim() {
        return true;
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
}
