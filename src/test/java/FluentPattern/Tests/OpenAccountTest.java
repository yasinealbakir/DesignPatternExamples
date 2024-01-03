package FluentPattern.Tests;

import FluentPattern.Pages.CustomerAddPage;
import FluentPattern.Pages.HomePage;
import FluentPattern.Pages.LoginPage;
import FluentPattern.Pages.OpenAccountPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenAccountTest {
    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    OpenAccountPage openAccountPage;
    CustomerAddPage customerAddPage;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        customerAddPage = new CustomerAddPage(driver);
        openAccountPage = new OpenAccountPage(driver);

    }

    @Test
    public void openDollarAccountTest() {
        loginPage.signIn()
                .navigateCustomerAddPage()
                .createNewCustomerRecord("","","")
                .clickCustomerSaveButton()
                .openDollarAccount("");

    }
}
