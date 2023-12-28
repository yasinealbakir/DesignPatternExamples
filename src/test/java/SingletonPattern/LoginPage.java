package SingletonPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    By usernameInput = By.id("kullaniciAdi");
    By passwordInput = By.id("parola");
    By loginButton = By.id("btnGirisYap");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        driver.get("https://demo.yasinalbakir.net/");
    }

    public void doLogin(String username, String password) {
        driver.findElement(usernameInput).sendKeys(username);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).click();
    }



}
