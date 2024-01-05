package BuilderPattern.Example;

import org.testng.annotations.Test;

public class BuilderTest {
    @Test
    public void carBuilderTest() {
        Car car = new CarBuilder("Toyota", "Corolla", 2024)
                .build();
    }

}
