package SingletonPattern;

import SingletonPattern.Example.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverSingleton {
    private static WebDriver driver;

    //Sorun1: Birden çok test senaryosu çalıştırıldığında her test senaryosu
    // için ayrı bir WebDriver örneği oluşturmak, kaynak tükenmesine ve performans sorunlarına neden olabilir.

    //Çözüm1: Singleton pattern kullanarak yalnızca bir WebDriver örneği oluşturarak,
    // kaynak kullanımını azaltabilir ve test senaryolarının daha hızlı çalışmasını sağlayabilirsiniz.

    //Sorun2: Test senaryolarında kullanılan konfigürasyon bilgilerini
    // (örneğin, tarayıcı türü, URL, kullanıcı adı, şifre) tek bir yerden yönetmek istiyorsunuz.

    //Çözüm2: Singleton pattern kullanarak konfigürasyon sınıfını tek bir noktadan yönetebilir
    // ve test senaryolarında bu bilgilere kolayca erişebilirsiniz.

    private WebDriverSingleton(BrowserType browser) {
        if (browser.equals(BrowserType.CHROME)) {
            driver = new ChromeDriver();
        } else if (browser.equals(BrowserType.EDGE)) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Browser not implemented.");
        }
    }

    public static WebDriver getDriver(BrowserType browser) {
        if (driver == null) {
            new WebDriverSingleton(browser);
        }
        return driver;
    }

    public static void closeWebDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
