package StrategyPattern.Strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class PayPal implements IPaymentStrategy {
    private WebDriver driver;
    private By payPalOption = By.id("PayPal option id");
    private By email = By.id("PayPal email element id");

    @Override
    public void pay(Map<String, String> paymentDetails) {
        driver.findElement(payPalOption).click();
        driver.findElement(email).sendKeys(paymentDetails.get("email"));
    }

}
