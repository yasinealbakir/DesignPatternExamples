package StrategyPattern.Pages;

import StrategyPattern.Strategies.IPaymentStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class PaymentPage {
    private WebDriver driver;
    private IPaymentStrategy paymentStrategy;
    private By paymentButton = By.id("payment button id");


    public PaymentPage(WebDriver driver, IPaymentStrategy paymentStrategy) {
        this.driver = driver;
        this.paymentStrategy = paymentStrategy;
        driver.get("https://www.e-ticaret-example.com");
    }

    public void doPayment(Map<String, String> paymentDetails) {
        paymentStrategy.pay(paymentDetails);
        driver.findElement(paymentButton).click();
    }


}
