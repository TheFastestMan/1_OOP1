package ru.learn.flowers;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Flower {
    private int price;
    private LocalDate receiptDate;
    private int expirationDays;
    private String color;

    public Flower(int price, LocalDate receiptDate, int expirationDate, String color) {
        this.price = price;
        this.receiptDate = receiptDate;
        this.expirationDays = expirationDate;
        this.color = color;
    }


    public LocalDate getExpirationDate() {
        return receiptDate.plusDays(expirationDays);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(LocalDate receiptDate) {
        this.receiptDate = receiptDate;
    }

    public int getExpirationDays() {
        return expirationDays;
    }

    public void setExpirationDays(int expirationDays) {
        this.expirationDays = expirationDays;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
