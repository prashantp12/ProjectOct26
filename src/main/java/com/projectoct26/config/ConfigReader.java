package com.projectoct26.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class ConfigReader {

    private static final Properties properties = new Properties();

    static {
        try (InputStream input = ConfigReader.class.getClassLoader()
                .getResourceAsStream("config.properties")) {

            if (input == null) {
                throw new IllegalStateException("config.properties not found.");
            }

            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Unable to load config.properties", e);
        }
    }

    private ConfigReader() {
    }

    public static String get(String key) {
        String value = properties.getProperty(key);

        if (value == null || value.isBlank()) {
            throw new RuntimeException(
                    "Property '" + key + "' is missing or empty in config.properties"
            );
        }

        return value.trim();

//        String systemProperty = System.getProperty(key);
//        if (systemProperty != null && !systemProperty.isBlank()) {
//            return systemProperty;
//        }
//
//        String environmentVariable = System.getenv(key);
//        if (environmentVariable != null && !environmentVariable.isBlank()) {
//            return environmentVariable;
//        }
//
//        String property = PROPERTIES.getProperty(key);
//        if (property == null) {
//            throw new IllegalArgumentException("Missing configuration key: " + key);
//        }
//
//        return property.trim();
    }

    public static boolean getBoolean(String key) {
        return Boolean.parseBoolean(get(key));
    }
}
