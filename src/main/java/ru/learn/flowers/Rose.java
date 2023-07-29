package ru.learn.flowers;

import java.time.LocalDate;

public class Rose extends Flower {
    public Rose(int price, LocalDate receiptDate, int expirationDate, String color) {
        super(price, receiptDate, expirationDate, color);
    }
}
