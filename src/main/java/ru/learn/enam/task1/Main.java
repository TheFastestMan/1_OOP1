package ru.learn.enam.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (Season season : Season.values()) {
            System.out.println(season.name() + " - " + season.getDescription() + " : " + season.getCountOfDys() + " days");
        }

        System.out.println();
        System.out.println("Write current season down: ");

        Scanner sc = new Scanner(System.in);

        String currentSeason = sc.nextLine().toUpperCase();

        Season season = Season.valueOf(currentSeason);

        System.out.println(season.getNextSeason(season));
    }

}
