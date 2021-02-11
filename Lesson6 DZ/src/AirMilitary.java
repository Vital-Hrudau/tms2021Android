public class AirMilitary extends Air {
    private boolean catapult; // наличие сист. катапультирования
    private int rockets; // кол-во ракет на борту

    public AirMilitary(int hp, int masSpeed, int mass, String brand, int wingspan, int minStriplength, boolean catapult, int rockets) {
        super(hp, masSpeed, mass, brand, wingspan, minStriplength);
        this.catapult = catapult;
        this.rockets = rockets;
    }

    public void description() {
        super.hpChange();
        System.out.println("Характеристики объекта (воздушный военный транспорт):");
        System.out.println("Можность (л.с.): " + getHp() + ". Мощность (кВ): " + getKilowatts() + ". " +
                "Максимальная скорость(км/ч): " + getMaxSpeed() + ". " +
                "Масса(кг): " + getMass() + ". " +
                "Марка: " + getBrand() + ". " + "\n" +
                "Размах крыльев(м): " + getWingspan() +
                ". Минимальная длина ВВП(м): " + getMinStriplength() +
                ". Система катапультирования: " + this.catapult + ". " +
                "Кол-во ракет на борту: " + this.rockets);
        shoot();
        goCatapult();
    }

    private void shoot() {
        if (rockets != 0) {
            System.out.println("Ракета пошла");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }

    }

    private void goCatapult() {
        if (catapult = true) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }

    public boolean isCatapult() {
        return catapult;
    }

    public int getRockets() {
        return rockets;
    }
}
