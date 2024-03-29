package ua.hillel.tests.utils;

import org.openqa.selenium.WebDriver;

public class DriverHolder {
    private static DriverHolder instance;

    private WebDriver driver;

    private DriverHolder() {}

    public static DriverHolder getInstance() {
        if (instance == null) {
            instance = new DriverHolder();
        }
        return instance;
    }

    public static void setDriver(WebDriver driver) {
        getInstance().driver = driver;
    }

    public static WebDriver getDriver() {
        return getInstance().driver;
    }
}
