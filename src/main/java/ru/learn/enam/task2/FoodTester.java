package ru.learn.enam.task2;

public class FoodTester {
    public boolean isVegetarian(Food[] foods) {
        for (Food food : foods) {
            FoodType foodType = food.getFoodType();
            switch (foodType) {
                case NUT:
                case FRUIT:
                case BREAD:
                case VEGETABLE:
                case PORRIDGE:
                case GREENS:
                case SOUP:
                case DAIRY:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

}
