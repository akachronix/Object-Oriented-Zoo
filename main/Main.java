package main;
import java.util.ArrayList;

import animals.Animal;
import animals.Cat;
import animals.Mouse;
import interfaces.Prey;
import interfaces.Walkable;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>(10);
        animals.add(new Mouse());
        animals.add(new Cat());
        animals.add(new Mouse());

        for (Animal animal : animals) {
            System.out.println("Species: " + animal.getSpecies());
            animal.makeSound();
            if (animal instanceof Prey) {
                ((Prey) animal).flee();
            }
            if (animal instanceof Walkable) {
                ((Walkable) animal).walk(5);
            }
            System.out.println();
        }
    }
}