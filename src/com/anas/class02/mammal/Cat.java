package com.anas.class02.mammal;

public class Cat extends Mammal {
    public void eat(){
        System.out.println("I eat fish");

    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
    }


}
