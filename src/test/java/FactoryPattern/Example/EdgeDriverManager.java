package FactoryPattern.Example;

import org.openqa.selenium.edge.EdgeDriver;

import java.io.IOException;

public class EdgeDriverManager extends DriverManager {
    @Override
    protected void startService() throws IOException {

    }

    @Override
    protected void stopService() {

    }

    @Override
    protected void createService() {
        driver = new EdgeDriver();
    }
}
