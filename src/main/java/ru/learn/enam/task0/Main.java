package ru.learn.enam.task0;


public class Main {
    public static void main(String[] args) {

        Pair<Day, String> schedule1 = new Pair<>(Day.MONDAY, "- 08:00-17:00");
        Pair<Day, String> schedule2 = new Pair<>(Day.TUESDAY, "- 08:00-17:00");
        Pair<Day, String> schedule3 = new Pair<>(Day.WEDNESDAY, "- 08:00-17:00");
        Pair<Day, String> schedule4 = new Pair<>(Day.THURSDAY, "- 08:00-17:00");
        Pair<Day, String> schedule5 = new Pair<>(Day.FRIDAY, "- 08:00-16:00");
        Pair<Day, String> schedule6 = new Pair<>(Day.SATURDAY, "- Weekend");
        Pair<Day, String> schedule7 = new Pair<>(Day.SUNDAY, "- Weekend");

        Pair[] pairArray = {schedule1, schedule2, schedule3,
                schedule4, schedule5, schedule6, schedule7};

        for (Pair pair : pairArray) {
            System.out.println(pair);
        }

    }
}
