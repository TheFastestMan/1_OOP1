package ru.learn.factoryMethod;

public class HouseManager {
    private MeasurementManipulating measurementManipulating;

    public HouseManager(MeasurementManipulating measurementManipulating) {
        this.measurementManipulating = measurementManipulating;
    }

    public void execute(int value, House house) {
        measurementManipulating.execute(value, house);
    }
}
