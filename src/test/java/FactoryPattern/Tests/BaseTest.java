package FactoryPattern.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setup() {
        System.out.println("Creating WebDriver Instance");
        this.driver = new ChromeDriver();
    }

    @AfterTest
    public void teardown() {
        System.out.println("WebDriver Instance Closing");
        this.driver.quit();
    }

}
