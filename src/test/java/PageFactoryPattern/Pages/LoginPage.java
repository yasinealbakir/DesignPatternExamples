package PageFactoryPattern.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    @FindBy(id = "kullaniciAdi")
    @CacheLookup
    WebElement usernameInput;

    @FindBy(id = "parola")
    @CacheLookup
    WebElement passwordInput;

    @FindBy(id = "btnGirisYap")
    @CacheLookup
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        driver.get("https://demo.yasinalbakir.net/");
        PageFactory.initElements(driver, this);
    }

    public void doLogin(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public String getHomePageTitle() {
        return driver.getTitle();
    }
}
