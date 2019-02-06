package com.company;
import java.util.ArrayList;

public class Zoo {

    private ArrayList<Pen> animalPens = new ArrayList<>();


    public void removePen(Pen pen) {
        animalPens.remove(pen);
        System.out.println("This pen has been removed.");
    }

    public void displayAllAnimalsInZoo() {
        for (Pen animalPen : animalPens) {
            System.out.println("Here are all of the animals in the zoo:" + animalPen.displayPenDetails());
        }
    }
}


