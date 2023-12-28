package FactoryPattern.Example;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class FactoryPatternTest {
    DriverManager driverManager;
    WebDriver driver;

    @BeforeTest
    public void setup() {
        driverManager = DriverManagerFactory.getManager(DriverType.EDGE);
    }

    @BeforeMethod
    public void beforeMethod() throws IOException {
        driver = driverManager.getDriver();
    }

    @AfterMethod
    public void afterMethod() {
        driverManager.quitDriver();
    }

    @Test
    public void launchTestAutomationGuruTest() {
        driver.get("https://demo.yasinalbakir.net");
        Assert.assertEquals("Demo Project", driver.getTitle());
    }
}
