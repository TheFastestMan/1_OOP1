package ru.learn.factoryMethod;

public class Humidifier implements MeasurementManipulating {
    @Override
    public void execute(int value, House house) {
        house.setHumidity(house.getHumidity() + value);
    }

}
