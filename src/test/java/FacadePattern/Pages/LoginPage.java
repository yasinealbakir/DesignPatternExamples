package FacadePattern.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By btnEnter = By.xpath("//button[normalize-space()='Bank Manager Login']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void signIn() {
        driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/login");
        driver.findElement(btnEnter).click();
    }

}
