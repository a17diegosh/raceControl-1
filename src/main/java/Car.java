public class Car {

    private int odometer;
    private int lastDistance;
    private static int maxSpeed = 5;
    private String brand;
    private String model;

    public Car (String brand, String model) {
        this.odometer = 0;
        this.brand = brand;
        this.model = model;
    }

    public Car (int odometer, String brand, String model) {
        this.odometer = odometer;
        this.brand = brand;
        this.model = model;
    }

    public void drive() {
        lastDistance = generateRandomDistance(maxSpeed);
        System.out.println(this.toString() + ", " + lastDistance);
        odometer += lastDistance;
    }

    private int generateRandomDistance(int maxValue) {
        Double randomDistance = new Double(Math.random() * maxValue);
        int newDistance = randomDistance.intValue();
        return newDistance;
    }

    public int getOdometer() {
        return this.odometer;
    }

    public void resetOdometer() {
        this.odometer = 0;
    }

    public String toString() {
        return this.brand + ", " + this.model + ", " + this.odometer;
    }
}
