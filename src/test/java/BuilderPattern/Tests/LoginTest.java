package BuilderPattern.Tests;

import BuilderPattern.Builders.UserBuilder;
import BuilderPattern.Pages.LoginPage;
import BuilderPattern.Pojos.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void builderDesignPatternTest() {
        User user = new UserBuilder()
                .setUsername("admin")
                .setPassword("123456")
                .build();

        loginPage.doLogin(user);
        Assert.assertEquals(driver.getTitle(),
                "Kullanıcı Tanımlama",
                "Web Page Title Not Match");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();

    }
}
