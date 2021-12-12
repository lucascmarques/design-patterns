package com.lucasmarques.designpatterns.structural.adapter;

public class BirdToyDuckAdapter implements ToyDuck {

    private Bird bird;

    public BirdToyDuckAdapter(Bird bird) {
        this.bird = bird;
    }

    public void squeak() {
        bird.makeSound();
    }
}
