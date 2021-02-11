public class Land extends Transport {
    public int getWheels() {
        return wheels;
    }

    public double getConsumption() {
        return consumption;
    }

    int wheels;
    double consumption; // л/100 км

    public Land(int hp, int masSpeed, int mass, String brand, int wheels, int consumption) {
        super(hp, masSpeed, mass, brand);
        this.wheels = wheels;
        this.consumption = consumption;
    }
}
