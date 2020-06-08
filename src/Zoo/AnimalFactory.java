package Zoo;

import Animals.Animal;
import Animals.Bird.Chicken;
import Animals.Bird.Eagle;
import Animals.Bird.Pigeon;
import Animals.Insect.Beetle;
import Animals.Insect.Spider;
import Animals.Mammal.Dolphin;
import Animals.Mammal.Whale;
import Exception.AnimalNotFoundException;

import java.util.HashMap;


public class AnimalFactory {

    public static Animal getAnimal(int type) {
        switch (type) {
            case 1:
                return new Dolphin();
            case 2:
                return new Whale();
            case 3:
                return new Eagle();
            case 4:
                return new Pigeon();
            case 5:
                return new Beetle();
            case 6:
                return new Spider();
            case 7:
                return new Chicken();

            default: throw new AnimalNotFoundException("No such animal! Range 1 - 7");
        }

    }

}
