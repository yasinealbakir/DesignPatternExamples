package FacadePattern.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerAddPage {
    WebDriver driver;
    By txtFirstName = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]");
    By txtLastName = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]");
    By txtPostCode = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]");
    By btnSave = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]");

    public CustomerAddPage(WebDriver driver) {
        this.driver = driver;
    }

    public void createNewCustomerRecord(String name, String lastname, String postcode) {
        driver.findElement(txtFirstName).sendKeys(name);
        driver.findElement(txtLastName).sendKeys(lastname);
        driver.findElement(txtPostCode).sendKeys(postcode);
        driver.findElement(btnSave).click();
    }

    public String getCustomerId() {
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        return ":".split(alertMessage)[1].trim();
    }
}
