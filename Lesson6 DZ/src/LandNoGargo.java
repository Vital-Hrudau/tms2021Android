import java.util.Scanner;

public class LandNoGargo extends Land { //легковой наземн
    String bodyType;// тип кузова
    int passengers;// кол-во пассажиров
    double liters;
    double distance;
    double kilowatts;


    void horsepower() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время(ч), затраченное на поездку: ");
        double time = scanner.nextDouble();
        this.distance = super.maxSpeed * time;
        consumption();
        System.out.println("За время " + time + " ч, автомобиль " + super.brand + " двигаясь с максимальной скоростью " +
                +super.maxSpeed + " км/ч проедет " + distance + "км и израсходует " + liters + " литров топлива");

    }

    private void consumption() {
        this.liters = (distance * super.consumption) / 100;
    }

    void hpChange() {
        kilowatts = super.hp * 0.74;
    }

    public LandNoGargo(int hp, int masSpeed, int mass, String brand, int wheels,
                       int consumption, String bodyType, int passengers) {
        super(hp, masSpeed, mass, brand, wheels, consumption);
        this.bodyType = "Автобус";
        this.passengers = 10;
    }


    public void description() {
        hpChange();
        System.out.println("Характеристики объекта (легковой наземный транспорт):");
        System.out.println("Можность (л.с.): " + super.hp + ". Мощность (кВ): " + kilowatts + ". " +
                "Максимальная скорость(км/ч): " + super.maxSpeed + ". " +
                "Масса(кг): " + super.mass + ". " +
                "Марка: " + super.brand + ". " +
                "Кол-во колес: " + super.wheels + ". " +
                "Расход топлива(л/100 км): " + super.consumption + ". " + "\n" +
                "Тип кузова: " + bodyType + ". " +
                "Кол-во пассажиров: " + passengers);
        horsepower();
    }


}
