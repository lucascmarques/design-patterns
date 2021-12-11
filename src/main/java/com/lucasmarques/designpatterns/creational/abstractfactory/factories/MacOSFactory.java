package com.lucasmarques.designpatterns.creational.abstractfactory.factories;

import com.lucasmarques.designpatterns.creational.abstractfactory.buttons.Button;
import com.lucasmarques.designpatterns.creational.abstractfactory.checkboxes.Checkbox;
import com.lucasmarques.designpatterns.creational.abstractfactory.buttons.MacOSButton;
import com.lucasmarques.designpatterns.creational.abstractfactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
