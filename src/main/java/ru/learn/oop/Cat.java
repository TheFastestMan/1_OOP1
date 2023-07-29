package ru.learn.oop;

public class Cat extends Animal {

    @Override
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    public void run() {
        System.out.println("Run better my cat");
    }



}
