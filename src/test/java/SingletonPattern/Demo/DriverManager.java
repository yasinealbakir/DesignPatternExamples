package SingletonPattern.Demo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    private static WebDriver driver;

    private DriverManager() {
        driver = new ChromeDriver();
    }

    public static WebDriver getInstance() {
        if (driver == null) {
            new DriverManager();
        }
        return driver;
    }

    public static void closeInstance() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
