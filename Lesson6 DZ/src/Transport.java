public class Transport {
    double hp;// л.с.
    double maxSpeed;// км\ч
    int mass;// кг
    String brand;// марка

    public Transport(int hp, int masSpeed, int mass, String brand) {
        this.hp = hp;
        this.maxSpeed = masSpeed;
        this.mass = mass;
        this.brand = brand;
    }

    public static void main(String[] args) {
        LandNoGargo landNoGargo = new LandNoGargo(120, 140, 3100, "Volkswagen", 4,
                14, "", 10);
        LandGargo landGargo = new LandGargo(234, 110, 5700, "МАЗ", 4, 23,
                5000);
        AirPassenger airPassenger = new AirPassenger(500, 740, 22000, "BELL",
                13, 2100, 34, true);
        AirMilitary airMilitary = new AirMilitary(650, 820, 19000, "МиГ", 8, 1600,
                true, 8);
        landNoGargo.description();
        landGargo.description();
        airPassenger.description();
        airMilitary.description();
    }
}
