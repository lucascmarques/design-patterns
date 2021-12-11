package com.lucasmarques.designpatterns.creational.abstractfactory.factories;

import com.lucasmarques.designpatterns.creational.abstractfactory.buttons.Button;
import com.lucasmarques.designpatterns.creational.abstractfactory.checkboxes.Checkbox;

/**
 * Abstract factory knows about all product types (abstractions).
 */
public interface GUIFactory {

    Button createButton();
    Checkbox createCheckbox();

}
