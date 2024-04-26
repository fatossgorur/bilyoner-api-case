package com.restapiexample.helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class ConfigHelper {
    public static ResourceBundle readProp(String systemSourcesDir) {

        ResourceBundle bundle = null;
        try {
            String propertyDir = "/src/test/resources/properties/" + systemSourcesDir;
            InputStream propertiesStream = new FileInputStream(System.getProperty("user.dir") + propertyDir);
            bundle = new PropertyResourceBundle(new InputStreamReader(propertiesStream, StandardCharsets.UTF_8));
            propertiesStream.close();

        } catch (IOException e) {
            throw new IllegalStateException("Exception on loading {" + systemSourcesDir + "} config file from classpath", e);
        }
        return bundle;
    }
}
