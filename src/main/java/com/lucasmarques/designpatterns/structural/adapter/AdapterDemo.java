package com.lucasmarques.designpatterns.structural.adapter;

public class AdapterDemo {

    public static void main(String[] args) {
        var sparrow = new Sparrow();
        var toyDuck = new PlasticToyDuck();

        var birdToyDuckAdapter = new BirdToyDuckAdapter(sparrow);

        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("ToyDuck...");
        toyDuck.squeak();

        System.out.println("BirdToyAdapter (Sparrow behaving like a toy duck)...");
        birdToyDuckAdapter.squeak();

    }

}
