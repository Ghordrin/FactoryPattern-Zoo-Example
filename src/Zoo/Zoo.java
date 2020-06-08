package Zoo;

import Animals.Animal;
import Animals.Bird.Chicken;
import Animals.Bird.Eagle;
import Animals.Bird.Pigeon;
import Animals.Insect.Beetle;
import Animals.Insect.Spider;
import Animals.Mammal.Dolphin;
import Animals.Mammal.Whale;
import Exception.ZooCannotBeEmpty;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zoo {

    public static ArrayList<Animal> zoo = new ArrayList<>();
    public static final Scanner sc = new Scanner(System.in);
    public static String input = "";

    public static void addAnimalsToZoo() {
        System.out.println("Would you like to add animals yourself or have it randomly generated? \n 0: Random \n 1: Choose \n");
        input = sc.nextLine();

        if (input.equalsIgnoreCase("0")) {
            for (int i = 0; i < genRandomNumber(100); i++) {
                zoo.add(AnimalFactory.getAnimal(genRandomNumber(7)));
            }
        } else if (input.equalsIgnoreCase("1")) {
            System.out.println("Type in a number to add an animal to the zoo. Range 1 - 7. Type 0 to QUIT. \n" +
                    "1 - Dolphin \n" +
                    "2 - Whale \n" +
                    "3 - Eagle \n" +
                    "4 - Pigeon \n" +
                    "5 - Beetle \n" +
                    "6 - Spider \n" +
                    "7 - Chicken \n");

            do {
                input = sc.nextLine();
                if (input.equalsIgnoreCase("0")) {
                    zooNotEmpty(zoo); // check if zoo is not empty
                    break;
                }
                zoo.add(AnimalFactory.getAnimal(Integer.parseInt(input)));
            } while (!input.equalsIgnoreCase("0"));
        }
    }

    public static void zooNotEmpty(ArrayList<Animal> zoo) {
        if (zoo.size() == 0) throw new ZooCannotBeEmpty("Zoo cannot be empty!");
    }

    public static void displayZoo() {
        // header
        System.out.printf("| %-20s | %-20s | %-20s |", "NAME", "EDIBLE", "DOMESTICATED");

        // information
        for (Animal animal : zoo) {
            System.out.println();
            System.out.printf("| %20s | %20s | %20s |", animal.getName(), animal.edible() ? "YES" : "NO", animal.domesticated() ? "YES" : "NO");
        }

        System.out.println("\n In total there are " + Pigeon.getAmountOfPigeonsCreated() + " birds, " + Eagle.getAmountOfEaglesCreated() + " eagles, " +
                Whale.getAmountOfWhalesCreated() + " whales, " + Dolphin.getAmountOfDolphins() + " dolphins, " + Spider.getAmountOfSpidersCreated() + " spiders, " + Chicken.getAmountOfChickensCreated() +
                " chickens and " + Beetle.getAmountOfBeetlesCreated() +
                " beetles in the zoo. ");
    }

    public static int genRandomNumber(int max) {
        Random rand = new Random();
        return rand.nextInt(max) + 1;
    }
}


