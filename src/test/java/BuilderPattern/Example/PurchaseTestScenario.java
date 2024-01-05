package BuilderPattern.Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PurchaseTestScenario {

    private User user;
    private ShoppingCart shoppingCart;

    public PurchaseTestScenario(User user, ShoppingCart shoppingCart) {
        this.user = user;
        this.shoppingCart = shoppingCart;
    }

    public void execute(WebDriver driver) {
        // Selenium kodları ile alışveriş senaryosu gerçekleştirilir
        // Örneğin, kullanıcı girişi yapılır, ürün sepete eklenir, ödeme yapılır, vb.

        // Kullanıcı girişi
        driver.findElement(By.id("username")).sendKeys(user.getUsername());
        driver.findElement(By.id("password")).sendKeys(user.getPassword());
        driver.findElement(By.id("loginButton")).click();

        // Ürünü sepete ekle
        driver.findElement(By.id("productSearch")).sendKeys(shoppingCart.getProduct().getName());
        driver.findElement(By.id("addToCartButton")).click();

        // Sepeti kontrol et
        WebElement cartElement = driver.findElement(By.id("shoppingCart"));
        String cartContent = cartElement.getText();
        assert cartContent.contains(shoppingCart.getProduct().getName());

        // Ödeme yap
        driver.findElement(By.id("checkoutButton")).click();
    }
}
