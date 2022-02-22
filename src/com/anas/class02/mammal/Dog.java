package com.anas.class02.mammal;

public class Dog extends Mammal{
//    private  String name;
    public Dog(){

    }
    public Dog(String name){
        super.name = name;
    }
//    public void setName(String name){
//        this.name = name;
//    }
    public void eat(){
        System.out.println("dog is eating meat");

    }

    public static void main(String[] args) {
        Dog dog = new Dog("Kitty");
//        dog.setName("Kitty");
        System.out.println(dog.name);
    }
}
