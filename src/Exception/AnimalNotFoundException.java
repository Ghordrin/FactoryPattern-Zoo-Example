package Exception;

import Zoo.AnimalFactory;

public class AnimalNotFoundException extends RuntimeException{

    public AnimalNotFoundException(String message) {
        super(message);
        System.out.println("Adding default animal to zoo as wrong range was specified. - [Dolphin]");
        AnimalFactory.getAnimal(1);
    }
}
