package BuilderPattern.Example;

public class CarBuilder {
    private String brand;
    private String model;
    private int year;

    private String color = "Beyaz";
    private String fuelType = "Petrol";

    public CarBuilder(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder fuelType(String fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    public Car build() {
        return new Car(this);
    }


}
