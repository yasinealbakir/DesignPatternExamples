package SingletonPattern.Example;

public class BrowserConfig {
    private static BrowserConfig instance;
    private BrowserType browser;

    private String version;

    public BrowserConfig(BrowserType browser, String version) {
        this.browser = browser;
        this.version = version;
    }

    public static synchronized BrowserConfig getInstance(BrowserType browser, String version) {
        if (instance == null) {
            instance = new BrowserConfig(browser, version);
        }
        return instance;
    }

    public BrowserType getBrowser() {
        return browser;
    }

    public String getVersion() {
        return version;
    }

}
