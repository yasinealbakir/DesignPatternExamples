package FactoryPattern.Example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;
import java.io.IOException;

public class ChromeDriverManager extends DriverManager {

    private ChromeDriverService chService;

    @Override
    protected void startService() throws IOException {
        if (chService == null) {
            chService = new ChromeDriverService.Builder()
                    .usingAnyFreePort()
                    .build();
            chService.start();
        }

    }

    @Override
    protected void stopService() {
        if (null != chService && chService.isRunning())
            chService.stop();

    }

    @Override
    protected void createService() {
        driver = new ChromeDriver();
    }
}
