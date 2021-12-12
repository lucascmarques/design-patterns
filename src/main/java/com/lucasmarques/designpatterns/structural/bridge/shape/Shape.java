package com.lucasmarques.designpatterns.structural.bridge.shape;

import com.lucasmarques.designpatterns.structural.bridge.color.Color;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public String draw();

}
