package ru.learn.factoryMethod;

public class Heater implements MeasurementManipulating {
    @Override
    public void execute(int value, House house) {
        house.setTemperature(house.getTemperature() + value);
    }

}
