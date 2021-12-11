package com.lucasmarques.designpatterns.creational.abstractfactory;

import com.lucasmarques.designpatterns.creational.abstractfactory.buttons.Button;
import com.lucasmarques.designpatterns.creational.abstractfactory.checkboxes.Checkbox;
import com.lucasmarques.designpatterns.creational.abstractfactory.factories.GUIFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void click() {
        button.click();
        checkbox.click();
    }

}
