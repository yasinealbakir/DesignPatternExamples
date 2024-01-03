package FluentPattern.Pages;

import FacadePattern.Pages.OpenAccountPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By btnAddCustomer = By.xpath("//button[normalize-space()='Add Customer']");
    By btnOpenAccount = By.xpath("//button[normalize-space()='Open Account']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public CustomerAddPage navigateCustomerAddPage() {
        driver.findElement(btnAddCustomer).click();
        return new CustomerAddPage(driver);
    }

    public OpenAccountPage navigateOpenAccountPage() {
        driver.findElement(btnOpenAccount).click();
        return new OpenAccountPage(driver);
    }

}
