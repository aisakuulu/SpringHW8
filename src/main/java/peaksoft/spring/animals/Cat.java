package peaksoft.spring.animals;

import peaksoft.spring.Animal;

public class Cat extends AnimalInfo implements Animal {

    @Override
    public void animalPlus() {
        System.out.println("Cat bean is initialised!!!");
    }

    @Override
    public void animalMinus() {
        System.out.println("Cat bean is destroyed!!!");
    }
}
