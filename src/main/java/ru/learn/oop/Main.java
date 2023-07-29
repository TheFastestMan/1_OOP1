package ru.learn.oop;

public class Main {

    public static void main(String[] args) {
        AnimalWorld animal = new AnimalWorld();

        Mamols m = new Mamols() {
            @Override
            public void suckMilk() {
                System.out.println("OOOPP");
            }
        };
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello from runable");
            }
        };

        Dog dog = new Dog();
        Cat cat = new Cat();

        runnable.run();
        runnable.run();
        runnable.run();
        m.suckMilk();


    }
}