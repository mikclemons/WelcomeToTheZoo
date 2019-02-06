package com.company;
import java.util.ArrayList;

public class Pen {

    private ArrayList<Animal> animals = new ArrayList<>();
    private ArrayList<BabyAnimal> babyAnimals = new ArrayList<>();

    public void addAnimalToPen(Animal animal){
        animals.add(animal);

    }

    public void addBabyAnimalToPen(BabyAnimal babyAnimal){
        babyAnimals.add(babyAnimal);

    }
}
