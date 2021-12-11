package com.lucasmarques.designpatterns.creational.abstractfactory.checkboxes;

public class MacOSCheckbox implements Checkbox {

    @Override
    public void click() {
        System.out.println("Clicked on a MacOSCheckbox");
    }

}
