package ru.learn.generics.task0;

public class Gen <T extends A>{
    private T obj;

    Gen() {
    }

    void getObj1(Gen<? extends A> child){
        System.out.println("child");
    }
    void getObj2(Gen<? super B> parent){
        System.out.println("parent");
    }

}
