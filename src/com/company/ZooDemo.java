package com.company;

import java.util.ArrayList;

public class ZooDemo {

    public static void main(String[] args) {

        Pen animalPen = new Pen();
        Zoo myZoo = new Zoo();


        Animal monkey = new Animal("Mokney", "large", "male");
        Animal lion = new Animal("Lion", "Medium", "female");
        BabyAnimal bear = new BabyAnimal("Polar Bear", "small", "male", true);
        BabyAnimal giraffe = new BabyAnimal("Giraffe", "medium", "female", false);

        animalPen.addAnimalToPen(monkey);
        animalPen.addAnimalToPen(lion);
        animalPen.addBabyAnimalToPen(bear);
        animalPen.addBabyAnimalToPen(giraffe);

        animalPen.displayPenDetails();

        animalPen.removeAnimal(monkey);
        animalPen.removeBabyAnimal(bear);

        animalPen.displayPenDetails();

        myZoo.displayAllAnimalsInZoo();

        myZoo.removePen(animalPen);
    }
}
