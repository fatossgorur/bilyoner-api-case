package com.restapiexample.helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigHelper {
    public static Properties readProp(String filePath) {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream(filePath)) {
            properties.load(fis);
        } catch (IOException e) {
            System.err.println("Error reading properties file: " + e.getMessage());
        }
        return properties;
    }
}
