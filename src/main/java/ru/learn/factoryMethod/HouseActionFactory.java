package ru.learn.factoryMethod;

public class HouseActionFactory {
    public static MeasurementManipulating select(String type) {
        if (type.equalsIgnoreCase("Heater")) {
            return new Heater();
        } else if (type.equalsIgnoreCase("Humidifier")) {
            return new Humidifier();
        }
        return null;
    }

}
