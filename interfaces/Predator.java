package interfaces;
import animals.Animal;

/**
 * Interface representing predator behavior.
 */
public interface Predator {
    /**
     * Makes the predator hunt a specified prey animal.
     * @param prey the animal object to be hunted
     */
    void hunt(Animal prey);
}