public class Mouse extends Animal implements Walkable, Prey {
    public Mouse() {
        super();
        setSpecies("Mouse");
    }

    @Override
    public void flee() {
        System.out.println("The mouse is running away.");
        setLocation(getLocation() + 10);
        System.out.println("The mouse's new location is: " + getLocation());
    }

    @Override
    public void makeSound() {
        System.out.println("Squeak squeak");
    }

    @Override
    public void walk(int distance) {
        setLocation(getLocation() + distance);
        System.out.println("The cat walked " + distance + " units. New location: " + getLocation());
    }
}
