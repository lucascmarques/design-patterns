package com.lucasmarques.designpatterns.structural.adapter;

public class Sparrow implements Bird {
    public void fly() {
        System.out.println("Flying");
    }

    public void makeSound() {
        System.out.println("Chirp chirp");
    }
}
