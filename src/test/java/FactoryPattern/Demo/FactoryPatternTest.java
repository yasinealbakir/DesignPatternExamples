package FactoryPattern.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Map;

public class FactoryPatternTest {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://demo.yasinalbakir.net/");
    }

    @Test
    public void factoryPatternTest() {
        // Data preparing
        ITestDataFactory loginTestData = new LoginTestDataFactory();
        Map<String, String> loginData = loginTestData.createTestData();

        loginPage = new LoginPage(driver);
        loginPage.doLogin(loginData);
        Assert.assertEquals(driver.getTitle(),"Kullanıcı Tanımlama");
        driver.quit();
    }
}
