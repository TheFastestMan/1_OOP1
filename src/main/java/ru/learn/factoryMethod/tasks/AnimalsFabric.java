package ru.learn.factoryMethod.tasks;

public class AnimalsFabric {

    public Animal select(AnimalType type){
        Animal animal = null;
        switch (type){
            case LIAN:
                animal = new Lian();
            break;
            case ZEBRA:
                animal = new Zebra();
            break;
            case TIGER:
                animal = new Tiger();
            break;
            default:
                System.out.println("No animals");
        }
        return animal;
    }
}
