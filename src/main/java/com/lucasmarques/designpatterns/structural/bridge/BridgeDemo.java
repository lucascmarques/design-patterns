package com.lucasmarques.designpatterns.structural.bridge;

import com.lucasmarques.designpatterns.structural.bridge.color.Blue;
import com.lucasmarques.designpatterns.structural.bridge.color.Red;
import com.lucasmarques.designpatterns.structural.bridge.shape.Square;
import com.lucasmarques.designpatterns.structural.bridge.shape.Triangle;

public class BridgeDemo {

    public static void main(String[] args) {

        var square = new Square(new Red());
        System.out.println(square.draw());

        var triangle = new Triangle(new Blue());
        System.out.println(triangle.draw());

    }

}
