package com.company;
import java.util.ArrayList;

public class Zoo {

    private ArrayList<Pen> animalPens = new ArrayList<>();

    public void removePen(Pen animalPen){
        animalPens.remove(animalPen);
    }
}
