package ru.learn.flowers;

import java.time.LocalDate;

public class Lily extends Flower {
    public Lily(int price, LocalDate receiptDate, int expirationDate, String color) {
        super(price, receiptDate, expirationDate, color);
    }
}
