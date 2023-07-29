package ru.learn.enam.task2;

public class Fruit extends Food {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public FoodType getFoodType() {
        return FoodType.FRUIT;
    }

}
