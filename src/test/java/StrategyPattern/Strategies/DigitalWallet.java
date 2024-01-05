package StrategyPattern.Strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class DigitalWallet implements IPaymentStrategy {

    private WebDriver driver;
    private By digitalWalletOption = By.id("Digital wallet option id");
    private By walletId = By.id("Digital wallet element id");

    @Override
    public void pay(Map<String, String> paymentDetails) {
        driver.findElement(digitalWalletOption).click();
        driver.findElement(walletId).sendKeys(paymentDetails.get("walletId"));
    }
}
