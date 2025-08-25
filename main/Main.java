package main;
import java.util.ArrayList;

import animals.Animal;
import animals.Cat;
import animals.Mouse;
import interfaces.Prey;
import interfaces.Walkable;

public class Main {
    public static void main(String[] args) {
        ZooManager zooManager = new ZooManager();
        zooManager.addAnimal(new Cat());
        zooManager.addAnimal(new Mouse());
        zooManager.listAnimals();
        zooManager.walkAll(5);
        zooManager.walkAll(3);
        zooManager.makeAllSounds();

    }
}