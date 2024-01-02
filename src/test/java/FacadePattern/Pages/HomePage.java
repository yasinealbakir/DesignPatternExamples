package FacadePattern.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By btnAddCustomer = By.xpath("//button[normalize-space()='Add Customer']");
    By btnOpenAccount = By.xpath("//button[normalize-space()='Open Account']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateCustomerAddPage() {
        driver.findElement(btnAddCustomer).click();
    }

    public void navigateOpenAccountPage() {
        driver.findElement(btnOpenAccount).click();
    }

}
