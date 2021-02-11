public class Transport {
    private double hp;// л.с.
    private double maxSpeed;// км\ч
    private int mass;// кг
    private String brand;// марка

    public double getKilowatts() {
        return kilowatts;
    }

    private double kilowatts;

    public Transport(int hp, int masSpeed, int mass, String brand) {
        this.hp = hp;
        this.maxSpeed = masSpeed;
        this.mass = mass;
        this.brand = brand;
    }

    protected void hpChange() {
        kilowatts = hp * 0.74;
    }

    public double getHp() {
        return hp;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public int getMass() {
        return mass;
    }

    public String getBrand() {
        return brand;
    }

}
