package by.teachmeskills.robot.legs;

public class SamsungLeg implements ILeg{
    private int price = 110;

    public SamsungLeg() {
    }

    public SamsungLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {

    }

    @Override
    public int getPrice() {
        return price;
    }
}
