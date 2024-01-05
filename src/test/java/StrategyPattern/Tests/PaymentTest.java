package StrategyPattern.Tests;

import StrategyPattern.Pages.PaymentPage;
import StrategyPattern.Strategies.CreditCard;
import StrategyPattern.Strategies.DigitalWallet;
import StrategyPattern.Strategies.IPaymentStrategy;
import StrategyPattern.Strategies.PayPal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class PaymentTest {
    WebDriver driver;
    PaymentPage paymentPage;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }

    @Test
    public void creditCardPaymentTest() {
        Map<String, String> creditCardDetails = new HashMap<>();
        creditCardDetails.put("cardNumber", "1234567890123456");
        creditCardDetails.put("cardHolderName", "John Doe");
        creditCardDetails.put("cvc", "123");

        IPaymentStrategy creditCardPayment = new CreditCard();
        paymentPage = new PaymentPage(driver, creditCardPayment);
        paymentPage.doPayment(creditCardDetails);

        //Assertion

    }

    @Test
    public void payPalPaymentTest() {
        Map<String, String> payPalCardDetails = new HashMap<>();
        payPalCardDetails.put("email", "abc@example.com");

        IPaymentStrategy payPalPayment = new PayPal();
        paymentPage = new PaymentPage(driver, payPalPayment);
        paymentPage.doPayment(payPalCardDetails);

        //Assertion

    }

    @Test
    public void digitalWalletPaymentTest() {
        Map<String, String> digitalWalletDetails = new HashMap<>();
        digitalWalletDetails.put("walletId", "5689566");

        IPaymentStrategy digitalWallet = new DigitalWallet();
        paymentPage = new PaymentPage(driver, digitalWallet);
        paymentPage.doPayment(digitalWalletDetails);

        //Assertion

    }


}
