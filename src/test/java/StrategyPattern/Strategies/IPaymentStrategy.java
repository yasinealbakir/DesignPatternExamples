package StrategyPattern.Strategies;

import org.openqa.selenium.WebDriver;

import java.util.Map;

public interface IPaymentStrategy {
    void pay(Map<String, String> paymentDetails);
}
