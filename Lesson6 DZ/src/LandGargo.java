import java.util.Scanner;

public class LandGargo extends Land { //грузовой наземн
    int carrying;// грузоподьемность
    double kilowatts;

    void hpChange() {
        kilowatts = super.hp * 0.74;
    }

    public LandGargo(int hp, int masSpeed, int mass, String brand, int wheels, int consumption, int carrying) {
        super(hp, masSpeed, mass, brand, wheels, consumption);
        this.carrying = carrying;
    }

    public void description() {
        hpChange();
        System.out.println("Характеристики объекта (грузовой наземный транспорт):");
        System.out.println("Можность (л.с.): " + super.hp + ". Мощность (кВ): " + kilowatts + ". " +
                "Максимальная скорость(км/ч): " + super.maxSpeed + ". " +
                "Масса(кг): " + super.mass + ". " +
                "Марка: " + super.brand + ". " +
                "Кол-во колес: " + super.wheels + ". " +
                "Расход топлива(л/100 км): " + super.consumption + "\n" +
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
}
