package FactoryPattern.Pages;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class GoogleFactory {
    private static final Function<WebDriver, GooglePage> ENG = GoogleEnglish::new;
    private static final Map<String, Function<WebDriver, GooglePage>> MAP = new HashMap<>();


    static {
        MAP.put("ENG", ENG);
    }

    public static GooglePage get(String language, WebDriver driver) {
        return MAP.get(language).apply(driver);
    }
}
