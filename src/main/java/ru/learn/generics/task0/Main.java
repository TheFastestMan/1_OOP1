package ru.learn.generics.task0;

public class Main {
    public static void main(String[] args) {

        Gen<A> genA = new Gen();
        Gen<B> genB = new Gen();
        Gen<C> genC = new Gen();

        genA.getObj1(genC);

    }
}
