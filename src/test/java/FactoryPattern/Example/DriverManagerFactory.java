package FactoryPattern.Example;

public class DriverManagerFactory {

    public static DriverManager getManager(DriverType type) {

        return switch (type) {
            case CHROME -> new ChromeDriverManager();
            case EDGE -> new EdgeDriverManager();
            default -> new SafariDriverManager();
        };

    }

}
