package FactoryPattern.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;


public class LoginPage {
    private WebDriver driver;
    By usernameInput = By.id("kullaniciAdi");
    By passwordInput = By.id("parola");
    By loginButton = By.id("btnGirisYap");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void doLogin(Map<String,String> data) {
        driver.findElement(usernameInput).sendKeys(data.get("username"));
        driver.findElement(passwordInput).sendKeys(data.get("password"));
        driver.findElement(loginButton).click();
    }


}
