package FactoryPattern.Example;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public abstract class DriverManager {

    protected WebDriver driver;

    protected abstract void startService() throws IOException;

    protected abstract void stopService();

    protected abstract void createService();

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public WebDriver getDriver() throws IOException {
        if (driver == null) {
            startService();
            createService();
        }
        return driver;
    }

}
