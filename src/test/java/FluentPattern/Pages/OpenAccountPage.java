package FluentPattern.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OpenAccountPage {

    WebDriver driver;
    Select select;
    By userSelect = By.xpath("//select[@id='userSelect']");
    By currencySelect = By.xpath("//select[@id='currency']");

    By btnProcess = By.xpath("//button[contains(text(),'Process')]");

    public OpenAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public OpenAccountPage openDollarAccount(String user) {
        select = new Select((WebElement) userSelect);
        select.selectByVisibleText(user);

        select = new Select((WebElement) currencySelect);
        select.selectByValue("Dollar");

        driver.findElement(btnProcess).click();
        return this;
    }
}
