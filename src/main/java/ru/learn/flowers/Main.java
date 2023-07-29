package ru.learn.flowers;


import ru.learn.studentHierarchy.Person;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Carnation carnation = new Carnation(100, LocalDate.of(2023, 5, 10), 10, "Red ");
        Orchid orchid = new Orchid(100, LocalDate.of(2023, 5, 10), 10, "White ");
        Rose rose = new Rose(100, LocalDate.of(2023, 5, 11), 10, "Purple ");
        Tulip tulip = new Tulip(100, LocalDate.of(2023, 5, 10), 10, "Orange ");

        Bouquet collectFlowers = new Bouquet(carnation, orchid, rose, tulip);

        System.out.println("The bouquet's total price is: " + collectFlowers.getTotalPrice());
        System.out.println("The bouquet will wither on: " + collectFlowers.getLatestExpirationDate());
        System.out.println("The flower colors are: " + collectFlowers.getColors());

    }
}
