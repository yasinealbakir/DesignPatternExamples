package FluentPattern.Tests;

import FluentPattern.Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demo.yasinalbakir.net/");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void loginTest() {
        loginPage.enterUsername("admin")
                .enterPassword("123456")
                .clickLoginButton();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
