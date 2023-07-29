package ru.learn.flowers;

import java.time.LocalDate;

public class Orchid extends Flower {
    public Orchid(int price, LocalDate receiptDate, int expirationDate, String color) {
        super(price, receiptDate, expirationDate, color);
    }
}
