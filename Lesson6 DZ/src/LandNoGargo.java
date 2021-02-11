import java.util.Scanner;

public class LandNoGargo extends Land { //легковой наземн
    private String bodyType;// тип кузова
    private int passengers;// кол-во пассажиров
    private double liters;
    private double distance;

    void horsepower() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время(ч), затраченное на поездку: ");
        double time = scanner.nextDouble();
        this.distance = getMaxSpeed() * time;
        consumption();
        System.out.println("За время " + time + " ч, автомобиль " + getBrand() + " двигаясь с максимальной скоростью " +
                +getMaxSpeed() + " км/ч проедет " + distance + "км и израсходует " + liters + " литров топлива");

    }

    private void consumption() {
        this.liters = (distance * getConsumption()) / 100;
    }

    public LandNoGargo(int hp, int masSpeed, int mass, String brand, int wheels,
                       int consumption, String bodyType, int passengers) {
        super(hp, masSpeed, mass, brand, wheels, consumption);
        this.bodyType = bodyType;
        this.passengers = passengers;
    }


    public void description() {
        super.hpChange();
        System.out.println("Характеристики объекта (легковой наземный транспорт):");
        System.out.println("Можность (л.с.): " + getHp() + ". Мощность (кВ): " + getKilowatts() + ". " +
                "Максимальная скорость(км/ч): " + getMaxSpeed() + ". " +
                "Масса(кг): " + getMass() + ". " +
                "Марка: " + getBrand() + ". " +
                "Кол-во колес: " + getWheels() + ". " +
                "Расход топлива(л/100 км): " + getConsumption() + ". " + "\n" +
                "Тип кузова: " + bodyType + ". " +
                "Кол-во пассажиров: " + passengers);
        horsepower();
    }


    public String getBodyType() {
        return bodyType;
    }

    public int getPassengers() {
        return passengers;
    }

    public double getLiters() {
        return liters;
    }

    public double getDistance() {
        return distance;
    }
}
