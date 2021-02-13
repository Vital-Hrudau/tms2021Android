package by.teachmeskills.robot.hands;

public class SonyHand implements IHand{
    private int price = 120;

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {
    }

    @Override
    public void upHand() {

    }

    @Override
    public int getPrice() {
        return price;
    }
}
