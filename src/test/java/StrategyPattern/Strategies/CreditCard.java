package StrategyPattern.Strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class CreditCard implements IPaymentStrategy {
    private WebDriver driver;
    private By creditCardOption = By.id("credit card option id");
    private By creditCardNumber = By.id("card number element id");
    private By cardHolderFullName = By.id("card holder's full name element id");
    private By cvc = By.id("cvc number element id");


    @Override
    public void pay(Map<String, String> paymentDetails) {
        driver.findElement(creditCardOption).click();
        driver.findElement(creditCardNumber).sendKeys(paymentDetails.get("cardNumber"));
        driver.findElement(cardHolderFullName).sendKeys(paymentDetails.get("cardHolderName"));
        driver.findElement(cvc).sendKeys(paymentDetails.get("cvc"));
    }

}
