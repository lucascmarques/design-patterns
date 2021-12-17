package com.lucasmarques.designpatterns.structural.decorator;

import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileDataSource implements DataSource {
    private final String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        try {
            Files.writeString(getPath(), data, StandardOpenOption.CREATE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readData() {
        try {
            return Files.readString(getPath());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private Path getPath() throws URISyntaxException {
        return Paths.get(ClassLoader.getSystemResource(filename).toURI());
    }
}
