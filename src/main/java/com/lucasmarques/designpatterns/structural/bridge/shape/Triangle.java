package com.lucasmarques.designpatterns.structural.bridge.shape;

import com.lucasmarques.designpatterns.structural.bridge.color.Color;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Triangle drawn. " + color.fill();
    }
}
