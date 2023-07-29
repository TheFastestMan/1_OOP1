package ru.learn.enam.task1;

import org.w3c.dom.ls.LSOutput;

public enum Season {
    SUMMER("hot", 92),
    AUTUMN("it's getting colder", 91),
    WINTER("very cold", 90),
    SPRING("warm", 92);
    private String description;
    private int countOfDys;

    Season(String description, int countOfDys) {
        this.description = description;
        this.countOfDys = countOfDys;
    }

    public String getDescription() {
        return description;
    }

    public int getCountOfDys() {
        return countOfDys;
    }

    public Season getNextSeason(Season currentSeason) {
        int index = currentSeason.ordinal();
        Season[] seasons = Season.values();
        return seasons[(index + 1) % seasons.length];
    }

}
