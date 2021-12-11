package com.lucasmarques.designpatterns.creational.abstractfactory.checkboxes;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void click() {
        System.out.println("Clicked on a WindowsCheckbox");
    }

}
