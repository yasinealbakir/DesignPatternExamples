package SingletonPattern.Demo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SingletonTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = DriverManager.getInstance();
    }

    @Test
    public void singletonPatternTest() {
        driver.get("https://demo.yasinalbakir.net");
    }

    @AfterClass
    public void teardown() {
        DriverManager.closeInstance();
    }
}
