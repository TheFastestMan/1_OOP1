package ru.learn.generics.task2;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        AnyDataArray<Integer> array = new AnyDataArray(1, 2, 3, 4, 5);
        int index = 4;

        array.printElement(index);

        System.out.println("Number under index " + index + " = " + array.printElement(index));
    }

}
