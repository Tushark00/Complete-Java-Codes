package OOPs.Inheritence;

import com.sun.tools.javac.Main;

 public class Animal {

     String color ="black";

//     constructor
     public Animal(int speed){
         System.out.println("runs: "+speed);
     }
    void eat(){
        System.out.println("eating from class A");
    }

//    static class Dog extends Animal {
//
//        void bark(){
//            System.out.println("bark from class b");
//        }
//    }
//
//    public static void main(String[] args) {
//
//        Dog d1= new Dog();
//
//        d1.eat();
//        d1.bark();
//    }
}
