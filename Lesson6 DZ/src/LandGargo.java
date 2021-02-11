import java.util.Scanner;

public class LandGargo extends Land { //грузовой наземн

    private int carrying;// грузоподьемность

    public LandGargo(int hp, int masSpeed, int mass, String brand, int wheels, int consumption, int carrying) {
        super(hp, masSpeed, mass, brand, wheels, consumption);
        this.carrying = carrying;
    }

    public void description() {
        super.hpChange();
        System.out.println("Характеристики объекта (грузовой наземный транспорт):");
        System.out.println("Можность (л.с.): " + getHp() + ". Мощность (кВ): " + getKilowatts() + ". " +
                "Максимальная скорость(км/ч): " + getMaxSpeed() + ". " +
                "Масса(кг): " + getMass() + ". " +
                "Марка: " + getBrand() + ". " +
                "Кол-во колес: " + getWheels() + ". " +
                "Расход топлива(л/100 км): " + getConsumption() + "\n" +
                "Грузоподьемность(кг): " + this.carrying);
        loadCargo();
    }

    private void loadCargo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массу (кг) вашего груза:");
        double cargo = scanner.nextDouble();
        if (cargo > this.carrying) {
            System.out.println("Вам нужен грузовик побольше!");
        } else {
            System.out.println("Погрузка...Грузовик загружен!");
        }
    }

    public int getCarrying() {
        return carrying;
    }
}
