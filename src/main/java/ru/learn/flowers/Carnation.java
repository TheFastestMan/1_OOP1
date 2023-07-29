package ru.learn.flowers;

import java.time.LocalDate;

public class Carnation extends Flower {
    public Carnation(int price, LocalDate receiptDate, int expirationDate, String color) {
        super(price, receiptDate, expirationDate, color);
    }
}
