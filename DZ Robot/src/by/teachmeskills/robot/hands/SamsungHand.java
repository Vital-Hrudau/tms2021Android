package by.teachmeskills.robot.hands;

import by.teachmeskills.robot.heads.IHead;

public class SamsungHand implements IHand {
    private int price = 100;

    public SamsungHand(int price) {
        this.price = price;
    }

    public SamsungHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Машет рукой от Самсунг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
