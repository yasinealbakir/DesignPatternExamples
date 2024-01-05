package BuilderPattern.BankExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerPage {
    WebDriver driver;
    By txtFirstName = By.xpath("//input[@placeholder='First Name']");
    By txtLastName = By.xpath("//input[@placeholder='Last Name']");
    By txtPostCode = By.xpath("//input[@placeholder='Post Code']");
    By btnSave = By.xpath("//button[@type='submit']");

    public CustomerPage(WebDriver driver) {
        this.driver = driver;
        this.driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/manager/addCust");
    }

    public void createNewCustomerRecord(Customer customer) {
        driver.findElement(txtFirstName).sendKeys(customer.getFirstName());
        driver.findElement(txtLastName).sendKeys(customer.getFirstName());
        driver.findElement(txtPostCode).sendKeys(customer.getPostCode());
        driver.findElement(btnSave).click();
    }

}
