public class AirMilitary extends Air {
    boolean catapult; // наличие сист. катапультирования
    int rockets; // кол-во ракет на борту
    double kilowatts;

    public AirMilitary(int hp, int masSpeed, int mass, String brand, int wingspan, int minStriplength, boolean catapult, int rockets) {
        super(hp, masSpeed, mass, brand, wingspan, minStriplength);
        this.catapult = catapult;
        this.rockets = rockets;
    }

    void hpChange() {
        kilowatts = super.hp * 0.74;
    }

    public void description() {
        hpChange();
        System.out.println("Характеристики объекта (воздушный военный транспорт):");
        System.out.println("Можность (л.с.): " + super.hp + ". Мощность (кВ): " + kilowatts + ". " +
                "Максимальная скорость(км/ч): " + super.maxSpeed + ". " +
                "Масса(кг): " + super.mass + ". " +
                "Марка: " + super.brand + ". " + "\n" +
                "Система катапультирования: " + this.catapult + ". " +
                "Кол-во ракет на борту: " + this.rockets);
        shoot();
    }

    private void shoot() {
        if (rockets != 0 && rockets > 0) {
            System.out.println("Ракета пошла");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
        if (catapult = true) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
