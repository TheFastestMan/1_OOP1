package ru.learn.oop;

public class Dog extends Animal{

    @Override
    public void voice() {
        System.out.println("Bow bow");
    }

    public void voice(String angryVoice){
        System.out.println(angryVoice);
    }

    public void voice(int numberOfVoice){
        System.out.println(numberOfVoice);
    }


}
