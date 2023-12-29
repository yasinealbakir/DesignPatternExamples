package SingletonPattern;

import SingletonPattern.Example.BrowserType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeClass
    public void setup() {
        driver = WebDriverSingleton.getDriver(BrowserType.EDGE);
        loginPage = new LoginPage(driver);
    }

    @Test
    public void singletonDesignPaternTest() {
        loginPage.doLogin("admin", "123456");
        WebDriverSingleton.closeWebDriver();
    }
}
