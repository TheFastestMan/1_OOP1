package ru.learn.generics.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please write your car name: ");
        String car = sc.nextLine();

        System.out.println("Please write your motorcycle name: ");
        String motorcycle = sc.nextLine();

        Garage<Car> garage1 = new Garage(new Car(car));
        Garage<Motorcycle> garage2 = new Garage(new Motorcycle(motorcycle));

        System.out.println(garage1.getVehicle().getName() + " is in garage!");
        System.out.println(garage2.getVehicle().getName() + " is in garage!");


    }
}
