package com.company;
import java.util.ArrayList;

public class Zoo {

    private ArrayList<Pen> animalPens = new ArrayList<>();

    public void removePen(Pen animalPen){
        animalPens.remove(animalPen);
    }

    public void displayAllAnimalsInZoo(){
        for(Pen pen : animalPens){
            System.out.println("Here are all of the animals in the zoo: " + pen.displayPenDetails());
        }
    }
}
