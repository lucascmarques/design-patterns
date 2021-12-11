package com.lucasmarques.designpatterns.creational.abstractfactory.buttons;

public class MacOSButton implements Button {

    @Override
    public void click() {
        System.out.println("Clicked on a MacOSButton");
    }
}
