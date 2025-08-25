public class Cat extends Animal implements Walkable, Predator {
    public Cat() {
        super();
        setSpecies("Cat");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void walk(int distance) {
        setLocation(getLocation() + distance);
        System.out.println("The cat walked " + distance + " units. New location: " + getLocation());
    }

    @Override
    public void hunt(Animal prey) {
        prey.kill();
        System.out.println("The cat has killed a " + prey.getSpecies());
    }
}
