package ru.learn.flowers;

import java.time.LocalDate;

public class Tulip extends Flower {
    public Tulip(int price, LocalDate receiptDate, int expirationDate, String color) {
        super(price, receiptDate, expirationDate, color);
    }
}
