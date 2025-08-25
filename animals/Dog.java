package animals;

import interfaces.Predator;
import interfaces.Walkable;

/**
 * Class representing a Dog, which is a type of Animal that can walk and hunt.
 */
public class Dog extends Animal implements Walkable, Predator {
    /**
     * Constructor to initialize a Dog object with default attributes.
     */
    public Dog() {
        super();
        setSpecies("Dog");
    }

    /*
     * Makes the Dog produce its characteristic sound.
     */
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
    
    /**
     * Makes the Dog walk a specified distance.
     * @param distance the distance for the cat to walk
     */
    @Override
    public void walk(int distance) {
        setLocation(getLocation() + distance);
        System.out.println("The dog walked " + distance + " units. New location: " + getLocation());
    }

    /**
     * Makes the dog hunt a specified prey animal.
     * @param prey the animal to be hunted
     */
    @Override
    public void hunt(Animal prey) {
        prey.kill();
        System.out.println("The dog has killed a " + prey.getSpecies());
    }
}
