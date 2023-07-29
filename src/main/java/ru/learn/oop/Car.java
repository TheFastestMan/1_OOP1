package ru.learn.oop;

public class Car {
    void honk(){
        System.out.println("honk honk");
    }

    void honk(String sound){
        System.out.println(sound);
    }

    void honk(boolean a){
        if (a){
            System.out.println("Beeeeep!!!");
        }else
            System.out.println("honk does not work");
    }

    void honk(int count, String message,String message2){

        for (int i = 0; i <= count; i++) {
            if (i%2==0){
                System.out.println(message);
            }else
                System.out.println(message2);
        }

    }


}
