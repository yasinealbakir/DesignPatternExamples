import PomPattern.Pages.SepetSayfasi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSenaryosu {
    private WebDriver driver;
    private SepetSayfasi sepetSayfasi;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.example.com/sepet");
        sepetSayfasi = new SepetSayfasi(driver);
    }

    @Test
    public void sepetIslemleriTest() {
        sepetSayfasi.urunAdetiniGuncelle(3);
        sepetSayfasi.kuponEkle("INDIRIM50");
        sepetSayfasi.sepettenCikar();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
