package ru.learn.flowers;

import java.sql.Date;
import java.time.LocalDate;

public class Bouquet {
    private Flower[] flowers;

    public Bouquet(Flower... flowers) {
        this.flowers = flowers;
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (Flower flower : flowers) {
            total += flower.getPrice();
        }
        return total;
    }

    public String getColors() {
        String color = "";
        for (Flower flower : flowers) {
            color += flower.getColor();
        }
        return color;
    }

    public LocalDate getLatestExpirationDate() {
        LocalDate latestExpirationDate = LocalDate.MIN;
        for (Flower flower : flowers) {
            if (flower.getExpirationDate().isAfter(latestExpirationDate)) {
                latestExpirationDate = flower.getExpirationDate();
            }
        }
        return latestExpirationDate;
    }

}
