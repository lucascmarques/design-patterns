package com.lucasmarques.designpatterns.creational.abstractfactory.buttons;

public class WindowsButton implements Button {

    @Override
    public void click() {
        System.out.println("Clicked on a WindowsButton");
    }

}
