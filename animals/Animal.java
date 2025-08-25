package animals;
public abstract class Animal {
    private String species;
    private int location;
    private boolean isAlive;

    /**
     * Constructor to initialize an animal with default values.
     */
    public Animal() {
        this.species = "Unknown";
        this.location = 0;
        this.isAlive = true;
    }

    /**
     * Kills the animal, setting its alive status to false.
     */
    public void kill() {
        isAlive = false;
    }

    /**
     * Revives the animal, setting its alive status to true.
     */
    public void revive() {
        isAlive = true;
    }

    /**
     * Checks if the animal is alive.
     * @return true if the animal is alive, false otherwise
     */
    public boolean isAlive() {
        return isAlive;
    }

    /**
     * Sets the species of the animal.
     * @param species the species to set
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * Sets the location of the animal.
     * @param location the location to set
     */
    public void setLocation(int location) {
        this.location = location;
    }

    /**
     * Gets the species of the animal.
     * @return the species of the animal
     */
    public String getSpecies() {
        return species;
    }

    /**
     * Gets the location of the animal.
     * @return the location of the animal
     */
    public int getLocation() {
        return this.location;
    }

    /**
     * Makes the animal produce its characteristic sound.
     */
    public abstract void makeSound();
}
