package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Robot3 implements IRobot{
    private SonyHand sonyHand;
    private SonyHead sonyHead;
    private ToshibaLeg toshibaLeg;

    public Robot3() {
    }

    public SonyHand getSonyHand() {
        return sonyHand;
    }

    public void setSonyHand(SonyHand sonyHand) {
        this.sonyHand = sonyHand;
    }

    public SonyHead getSonyHead() {
        return sonyHead;
    }

    public void setSonyHead(SonyHead sonyHead) {
        this.sonyHead = sonyHead;
    }

    public ToshibaLeg getToshibaLeg() {
        return toshibaLeg;
    }

    public void setToshibaLeg(ToshibaLeg toshibaLeg) {
        this.toshibaLeg = toshibaLeg;
    }

    public Robot3(SonyHand sonyHand, SonyHead sonyHead, ToshibaLeg toshibaLeg) {
        this.sonyHand = sonyHand;
        this.sonyHead = sonyHead;
        this.toshibaLeg = toshibaLeg;
    }

    @Override
    public void action() {
        sonyHand.upHand();
        sonyHead.speek();
        toshibaLeg.step();
    }

    @Override
    public int getPrice() {
        int price = sonyHand.getPrice() + sonyHead.getPrice() + toshibaLeg.getPrice();
        return price;
    }
}
