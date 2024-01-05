package BuilderPattern.Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ECommerceTestAutomation {
    WebDriver driver = new ChromeDriver();

    @Test
    public void test() {
        User user = new User("testuser", "testpassword");
        Product product = new Product("TestProduct", 50.0);
        ShoppingCart shoppingCart = new ShoppingCart(product, 2);
        PurchaseTestScenario purchaseTestScenario = new PurchaseTestScenario(user, shoppingCart);

        // Senaryoyu çalıştır
        driver.get("https://www.example.com");
        purchaseTestScenario.execute(driver);

        // WebDriver'ı kapat
        driver.quit();
    }
}
