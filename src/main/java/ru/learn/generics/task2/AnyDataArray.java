package ru.learn.generics.task2;

import java.awt.font.NumericShaper;

public class AnyDataArray<T extends Number> {
    private T[] array;

    public AnyDataArray(T... array) {
        this.array = array;
    }

    private T getNumberByIndex(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("There is not this index");
        }
    }

    public T printElement(int index) {
        return getNumberByIndex(index);
    }

}

