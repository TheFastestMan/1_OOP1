package ru.learn.moderCoffeeShop;

public abstract class SimpleCoffeeFactory {

    public Coffee createCoffee(CoffeeType type){
        Coffee coffee = null;
        switch (type) {
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case AMERICANO:
                coffee = new Americano();
                break;
            case CAFFE_LATTE:
                coffee = new CaffeLatte();
                break;
            case CAPPUCCINO:
                coffee = new Cappuccino();
                break;
        }
        return coffee;
    }


}
