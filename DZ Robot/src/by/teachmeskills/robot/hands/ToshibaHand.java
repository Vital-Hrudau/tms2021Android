package by.teachmeskills.robot.hands;

public class ToshibaHand implements IHand{
    private int price = 110;;

    public ToshibaHand(int price) {
        this.price = price;
    }

    public ToshibaHand() {
    }

    @Override
    public void upHand() {

    }

    @Override
    public int getPrice() {
        return price;
    }
}
