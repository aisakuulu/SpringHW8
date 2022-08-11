package peaksoft.spring.animals;

import peaksoft.spring.Animal;

public class Horse extends AnimalInfo implements Animal {

    @Override
    public void animalPlus() {
        System.out.println("Horse bean is initialised!!!");
    }

    @Override
    public void animalMinus() {
        System.out.println("Horse bean is destroyed!!!");
    }
}
