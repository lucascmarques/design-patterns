package com.lucasmarques.designpatterns.structural.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        var salaryRecord = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        var fileDataSource = new FileDataSource("decorator.txt");
        var encryptionAndCompressionDecorator = new EncryptionDecorator(new CompressionDecorator(fileDataSource));
        encryptionAndCompressionDecorator.writeData(salaryRecord);

        System.out.println("- INPUT -------------------------");
        System.out.println(salaryRecord);
        System.out.println("- ENCODED -----------------------");
        System.out.println(fileDataSource.readData());
        System.out.println("- DECODED -----------------------");
        System.out.println(encryptionAndCompressionDecorator.readData());
    }
}
