package main;

import java.util.ArrayList;
import animals.Animal;
import interfaces.Walkable;

/**
 * Class to manage a collection of animals in a zoo.
 */
public class ZooManager {
    private ArrayList<Animal> animals;

    /**
     * Constructor to initialize the ZooManager with an empty list of animals.
     */
    public ZooManager() {
        animals = new ArrayList<>();
    }

    /**
     * Adds an animal to the zoo.
     * @param animal the animal to add
     */
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    /**
     * Lists all animals in the zoo with their index and species.
     */
    public void listAnimals() {
        for (int i = 0; i < animals.size(); i++) {
            System.out.println("Animal " + i + ": " + animals.get(i).getSpecies());
        }
    }

    /**
     * Gets the animal at the specified index.
     * @param index the index of the animal to retrieve
     * @return the animal at the specified index, or null if the index is out of bounds
     */
    public Animal getAnimal(int index) {
        if (index >= 0 && index < animals.size()) {
            return animals.get(index);
        }
        
        throw new IndexOutOfBoundsException("Invalid index: " + index);
    }

    /**
     * Makes all walkable animals walk a specified distance.
     * @param distance the distance for each walkable animal to walk
     */
    public void walkAll(int distance) {
        for (Animal animal : animals) {
            if (animal instanceof Walkable) {
                ((Walkable) animal).walk(distance);
            }
        }
    }

    /**
     * Makes all animals in the zoo make their respective sounds.
     */
    public void makeAllSounds() {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
