package PomPattern.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SepetSayfasi {
    private WebDriver driver;

    private By urunAdetInput = By.xpath("//input[@class='urun-adet']");
    private By sepettenCikarButton = By.xpath("//button[@class='sepetten-cikar']");
    private By kuponEkleInput = By.xpath("//input[@id='kupon-kodu']");
    private By kuponEkleButton = By.xpath("//button[@id='kupon-ekle']");

    public SepetSayfasi(WebDriver driver) {
        this.driver = driver;
    }

    public void urunAdetiniGuncelle(int yeniAdet) {
        driver.findElement(urunAdetInput).clear();
        driver.findElement(urunAdetInput).sendKeys(String.valueOf(yeniAdet));
    }

    public void sepettenCikar() {
        driver.findElement(sepettenCikarButton).click();
    }

    public void kuponEkle(String kuponKodu) {
        driver.findElement(kuponEkleInput).sendKeys(kuponKodu);
        driver.findElement(kuponEkleButton).click();
    }
}
