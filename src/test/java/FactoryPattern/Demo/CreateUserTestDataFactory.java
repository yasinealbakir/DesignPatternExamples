package FactoryPattern.Demo;

import java.util.HashMap;
import java.util.Map;

public class CreateUserTestDataFactory implements ITestDataFactory {
    @Override
    public Map<String, String> createTestData() {
        Map<String, String> testData = new HashMap<>();
        testData.put("name", "ad soyad");
        testData.put("gender", "male");
        testData.put("email", "adsoyad@company.com");
        return testData;
    }
}
