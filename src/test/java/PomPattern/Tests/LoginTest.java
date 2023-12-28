package PomPattern.Tests;

import PomPattern.Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test
    public void loginTest() {
        loginPage = new LoginPage(driver);
        loginPage.doLogin("admin", "123456");
        Assert.assertEquals(loginPage.getHomePageTitle(),
                "Kullanıcı Tanımlama",
                "Web Page Title Not Match");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

}
