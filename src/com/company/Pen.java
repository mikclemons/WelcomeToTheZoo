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

    public void removeAnimal(Animal animal){
        animals.remove(animal);
    }

    public void removeBabyAnimal(BabyAnimal babyAnimal){
        babyAnimals.remove(babyAnimal);
    }

    public String displayPenDetails(){
        for(Animal animal : animals){
            System.out.println("Here are the amimals currently in the Pen: " + animal.printDetails());
        }
        for(BabyAnimal babyAnimal : babyAnimals){
            System.out.println("Here are the babyAnimals currently in the Pen:\n" + babyAnimal.printDetails());
        }
        return "";
    }
}
