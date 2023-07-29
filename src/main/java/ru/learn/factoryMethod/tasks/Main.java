package ru.learn.factoryMethod.tasks;

public class Main {
    public static void main(String[] args) {
        AnimalsFabric animalsFabric = new AnimalsFabric();

        Animal tiger = animalsFabric.select(AnimalType.TIGER);
        Animal zebra = animalsFabric.select(AnimalType.ZEBRA);
        Animal lian = animalsFabric.select(AnimalType.LIAN);

        tiger.sound();
        zebra.sound();
        lian.sound();
    }
}
