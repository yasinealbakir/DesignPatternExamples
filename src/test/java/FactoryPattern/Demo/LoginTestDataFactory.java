package FactoryPattern.Demo;

import java.util.HashMap;
import java.util.Map;

public class LoginTestDataFactory implements ITestDataFactory {
    @Override
    public Map<String, String> createTestData() {
        Map<String, String> testData = new HashMap<>();
        testData.put("username", "admin");
        testData.put("password", "123456");
        return testData;
    }
}
