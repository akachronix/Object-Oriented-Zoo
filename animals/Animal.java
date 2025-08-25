package animals;
public abstract class Animal {
    private String species;
    private int location;
    private boolean isAlive;

    public Animal() {
        this.species = "Unknown";
        this.location = 0;
        this.isAlive = true;
    }

    public void kill() {
        isAlive = false;
    }

    public void revive() {
        isAlive = true;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public String getSpecies() {
        return species;
    }

    public int getLocation() {
        return this.location;
    }

    public abstract void makeSound();
}
