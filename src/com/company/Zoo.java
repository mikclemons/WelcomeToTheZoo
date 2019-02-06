package com.company;
import java.util.ArrayList;

public class Zoo {

    private ArrayList<Pen> animalPens = new ArrayList<>();

   // public void addPen(Pen pen){
        //animalPens.add(pen);
   // }

    public void removePen(Pen pen){
        animalPens.remove(pen);
    }

    public void displayAllAnimalsInZoo(){
        for(Pen pen : animalPens){
            System.out.println("Here are all of the animals in the zoo: " + pen.displayPenDetails());
        }
    }
}
