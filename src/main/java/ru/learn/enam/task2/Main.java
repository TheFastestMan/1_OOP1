package ru.learn.enam.task2;

public class Main {
    public static void main(String[] args) {

        Fruit fruit = new Fruit();
        Meat meat = new Meat();
        Bread bread = new Bread();


        FoodTester foodTester = new FoodTester();

        Food[] arr = {fruit, bread, meat};

        System.out.println(foodTester.isVegetarian(arr));
    }

}
