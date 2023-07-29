package ru.learn.enam.task3;

public class Main {
    public static void main(String[] args) {
        Week week = Week.MONDAY;
        switch( week){
            case FRIDAY:
                System.out.println("Frd");
                 break;
            case MONDAY:
                System.out.println("MON");
                break;
            default:
                System.out.println("OUT");

        }
        System.out.println("hello");
    }
}
