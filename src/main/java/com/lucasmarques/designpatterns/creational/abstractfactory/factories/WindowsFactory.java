package com.lucasmarques.designpatterns.creational.abstractfactory.factories;

import com.lucasmarques.designpatterns.creational.abstractfactory.buttons.Button;
import com.lucasmarques.designpatterns.creational.abstractfactory.checkboxes.Checkbox;
import com.lucasmarques.designpatterns.creational.abstractfactory.buttons.WindowsButton;
import com.lucasmarques.designpatterns.creational.abstractfactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
