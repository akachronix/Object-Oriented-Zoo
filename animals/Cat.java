package animals;

import interfaces.Predator;
import interfaces.Walkable;

/**
 * Class representing a Cat, which is a type of Animal that can walk and hunt.
 */
public class Cat extends Animal implements Walkable, Predator {
    /**
     * Constructor to initialize a Cat with species variable set.
     */
    public Cat() {
        super();
        setSpecies("Cat");
    }

    /**
     * Makes the cat produce its characteristic sound.
     */
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    /**
     * Makes the cat walk a specified distance.
     * @param distance the distance for the cat to walk
     */
    @Override
    public void walk(int distance) {
        setLocation(getLocation() + distance);
        System.out.println("The cat walked " + distance + " units. New location: " + getLocation());
    }

    /**
     * Makes the cat hunt a specified prey animal.
     * @param prey the animal to be hunted
     */
    @Override
    public void hunt(Animal prey) {
        prey.kill();
        System.out.println("The cat has killed a " + prey.getSpecies());
    }
}
