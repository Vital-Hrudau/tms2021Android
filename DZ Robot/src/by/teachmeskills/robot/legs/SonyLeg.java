package by.teachmeskills.robot.legs;

public class SonyLeg implements ILeg{
    private int price = 125;;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public void step() {
        System.out.println("Шагает ногой Сони");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
