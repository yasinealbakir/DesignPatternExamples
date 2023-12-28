package PageFactoryPattern.Tests;

import PageFactoryPattern.Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;

    @Test
    public void pageFactoryDesignPatternTest() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        loginPage.
                doLogin("admin", "123456");
        Assert.assertEquals(loginPage.getHomePageTitle(),
                "Kullanıcı Tanımlama",
                "Web Page Title Not Match");
        driver.quit();
    }
}
