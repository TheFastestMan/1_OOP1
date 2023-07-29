package ru.learn.moderCoffeeShop;

public abstract class CoffeeShop {

    public Coffee orderCoffee(CoffeeType coffeeType) {
        Coffee coffee = createCoffee(coffeeType);

        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourCoffee();

        System.out.println("Coffee is ready" + " " + coffeeType);
        return coffee;
    }

    protected abstract Coffee createCoffee(CoffeeType type);
}
