package com.company;

public class BabyAnimal extends Animal {

    private boolean canWalk;


    public BabyAnimal(String species, String size, String gender, boolean canWalk) {
        super(species, size, gender);
        this.canWalk = canWalk;
        this.setSpecies(species);
        this.setSize(size);
        this.setGender(gender);

    }

    @Override
    public String printDetails() {
        return ("species: " + getSpecies() + "\n" +
                "size: " + getSize() + "\n" +
                "gender: " + getGender() + "\n" +
                "can they walk: " + canWalk);
    }
}
