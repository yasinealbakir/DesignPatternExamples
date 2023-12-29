package FactoryPattern.Demo;

import java.util.HashMap;
import java.util.Map;

public class CreateUserTestDataFactory implements ITestDataFactory {
    @Override
    public Map<String, String> createTestData() {
        Map<String, String> testData = new HashMap<>();
        testData.put("ad1", "soyad1");
        testData.put("ad2", "soyad2");
        return testData;
    }
}
