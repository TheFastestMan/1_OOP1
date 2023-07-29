package ru.learn.factoryMethod;

public class Main {
    public static void main(String[] args) {

        House house = new House(18,35);
        System.out.println("Humidity is: " + house.getHumidity() + " temperature is: " + house.getTemperature());

        HouseManager houseManagerHum = new HouseManager(HouseActionFactory.select("humidifier"));
        HouseManager houseManagerTemp = new HouseManager(HouseActionFactory.select("heater"));
        houseManagerHum.execute(8, house);
        houseManagerTemp.execute(3, house);

        System.out.println("The temperature and humidity are increased");
        System.out.println("Humidity is: " + house.getHumidity() + " temperature is: " + house.getTemperature());


    }
}
