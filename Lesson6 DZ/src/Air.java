public class Air extends Transport {
    private int wingspan; //размах крыльев
    private int minStriplength; // мин длина ВПП

    public Air(int hp, int masSpeed, int mass, String brand, int wingspan, int minStriplength) {
        super(hp, masSpeed, mass, brand);
        this.wingspan = wingspan;
        this.minStriplength = minStriplength;
    }

    public int getWingspan() {
        return wingspan;
    }

    public int getMinStriplength() {
        return minStriplength;
    }
}
