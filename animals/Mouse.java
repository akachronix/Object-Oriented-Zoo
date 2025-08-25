package animals;
import interfaces.Prey;
import interfaces.Walkable;

/**
 * Class representing a Mouse, which is a type of Animal that can walk and flee.
 */
public class Mouse extends Animal implements Walkable, Prey {
    /**
     * Constructor to initialize a Mouse with species variable set.
     */
    public Mouse() {
        super();
        setSpecies("Mouse");
    }

    /**
     * Makes the mouse flee by increasing its location.
     */
    @Override
    public void flee() {
        System.out.println("The mouse is running away.");
        setLocation(getLocation() + 10);
        System.out.println("The mouse's new location is: " + getLocation());
    }

    /**
     * Makes the mouse produce its characteristic sound.
     */
    @Override
    public void makeSound() {
        System.out.println("Squeak squeak");
    }

    /**
     * Makes the mouse walk a specified distance.
     * @param distance the distance for the mouse to walk
     */
    @Override
    public void walk(int distance) {
        setLocation(getLocation() + distance);
        System.out.println("The mouse walked " + distance + " units. New location: " + getLocation());
    }
}
