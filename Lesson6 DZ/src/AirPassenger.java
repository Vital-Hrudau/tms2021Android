import java.util.Scanner;

public class AirPassenger extends Air {
    int passengers = 140;// кол-во пассажиров
    boolean isBusiness = false; // наличие бизнес класса
    double kilowatts;

    public AirPassenger(int hp, int masSpeed, int mass, String brand, int wingspan, int minStriplength, int passengers, boolean isBusiness) {
        super(hp, masSpeed, mass, brand, wingspan, minStriplength);
        this.passengers = passengers;
        this.isBusiness = isBusiness;
    }

    void hpChange() {
        kilowatts = super.hp * 0.74;
    }

    public void description() {
        hpChange();
        System.out.println("Характеристики объекта (воздушный гражданский транспорт):");
        System.out.println("Можность (л.с.): " + super.hp + ". Мощность (кВ): " + kilowatts + ". " +
                "Максимальная скорость(км/ч): " + super.maxSpeed + ". " +
                "Масса(кг): " + super.mass + ". " +
                "Марка: " + super.brand + ". " +
                "Вместимость пассажиров: " + this.passengers + ". " +
                "Наличие бизнес класса: " + this.isBusiness);
        loadPassengers();
    }

    private void loadPassengers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во пассажиров:");
        double passengers = scanner.nextDouble();
        if (passengers > this.passengers) {
            System.out.println("Вам нужен самолет побольше!");
        } else {
            System.out.println("Добро пожаловать на борт!");
        }
    }
}
