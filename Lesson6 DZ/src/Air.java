public class Air extends Transport {
    int wingspan = 30; //размах крыльев
    int minStriplength = 10000; // мин длина ВПП

    public Air(int hp, int masSpeed, int mass, String brand, int wingspan, int minStriplength) {
        super(hp, masSpeed, mass, brand);
        this.wingspan = wingspan;
        this.minStriplength = minStriplength;
    }
}
