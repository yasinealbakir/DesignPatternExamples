package SingletonPattern.Example;

import org.testng.annotations.Test;

public class SingletonPatternTest {

    @Test
    public void singletonPatternTest() {
        BrowserConfig config = BrowserConfig.
                getInstance(BrowserType.CHROME, "Latest");
        System.out.println(config.getBrowser());
    }
}
