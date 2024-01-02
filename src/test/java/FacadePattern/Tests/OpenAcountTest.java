package FacadePattern.Tests;

import FacadePattern.Facades.OpenDollarAccountFacade;
import FacadePattern.Pages.CustomerAddPage;
import FacadePattern.Pages.HomePage;
import FacadePattern.Pages.LoginPage;
import FacadePattern.Pages.OpenAccountPage;
import FacadePattern.Pojos.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class OpenAcountTest {
    OpenDollarAccountFacade openDollarAccountFacade;
    LoginPage loginPage;
    HomePage homePage;
    CustomerAddPage customerAddPage;
    OpenAccountPage openAccountPage;
    User user;
    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        customerAddPage = new CustomerAddPage(driver);
        openAccountPage = new OpenAccountPage(driver);
        openDollarAccountFacade = new OpenDollarAccountFacade(loginPage, homePage, customerAddPage, openAccountPage);

    }

    @Test
    public void openDollarAccountTest() {
        openDollarAccountFacade.openingDollarAccountForNewCustomer(
                new User("selenium", "driver", "06601"));
        Assert.assertEquals(driver.switchTo().alert().getText(), "Account created successfully with account Number");
    }
}
