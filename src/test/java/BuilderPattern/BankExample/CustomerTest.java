package BuilderPattern.BankExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class CustomerTest {
    WebDriver driver;
    CustomerPage customerPage;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        customerPage = new CustomerPage(driver);
    }

    @Test
    public void customerAddTest() {
        Customer customer = new CustomerBuilder("Salih", "Öztürk", "06690")
                .build();
        customerPage.createNewCustomerRecord(customer);
        driver.quit();

    }
}
