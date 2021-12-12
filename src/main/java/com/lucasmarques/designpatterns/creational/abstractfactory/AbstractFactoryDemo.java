package com.lucasmarques.designpatterns.creational.abstractfactory;

import com.lucasmarques.designpatterns.creational.abstractfactory.factories.GUIFactory;
import com.lucasmarques.designpatterns.creational.abstractfactory.factories.MacOSFactory;
import com.lucasmarques.designpatterns.creational.abstractfactory.factories.WindowsFactory;

public class AbstractFactoryDemo {

    private static Application configureApplication() {
        String osName = System.getProperty("os.name").toLowerCase();
        GUIFactory factory = osName.contains("mac") ? new MacOSFactory() : new WindowsFactory();
        return new Application(factory);
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.click();
    }

}
