package FluentPattern.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By usernameInput = By.id("kullaniciAdi");
    By passwordInput = By.id("parola");
    By loginButton = By.id("btnGirisYap");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public LoginPage enterUsername(String username) {
        driver.findElement(usernameInput).sendKeys(username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
        return this;
    }

    public HomePage clickLoginButton() {
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }
}
