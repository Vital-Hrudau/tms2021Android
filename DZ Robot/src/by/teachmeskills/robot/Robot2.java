package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.SonyLeg;

public class Robot2 implements IRobot {
    private ToshibaHand toshibaHand;
    private ToshibaHead toshibaHead;
    private SonyLeg sonyLeg;

    public Robot2() {
    }

    public Robot2(ToshibaHand toshibaHand, ToshibaHead toshibaHead, SonyLeg sonyLeg) {
        this.toshibaHand = toshibaHand;
        this.toshibaHead = toshibaHead;
        this.sonyLeg = sonyLeg;
    }

    @Override
    public void action() {
        toshibaHead.speek();
        toshibaHand.upHand();
        sonyLeg.step();
    }

    @Override
    public int getPrice() {
        int price = toshibaHand.getPrice() + toshibaHead.getPrice() + sonyLeg.getPrice();
        return price;
    }

    public ToshibaHand getToshibaHand() {
        return toshibaHand;
    }

    public void setToshibaHand(ToshibaHand toshibaHand) {
        this.toshibaHand = toshibaHand;
    }

    public ToshibaHead getToshibaHead() {
        return toshibaHead;
    }

    public void setToshibaHead(ToshibaHead toshibaHead) {
        this.toshibaHead = toshibaHead;
    }

    public SonyLeg getSonyLeg() {
        return sonyLeg;
    }

    public void setSonyLeg(SonyLeg sonyLeg) {
        this.sonyLeg = sonyLeg;
    }
}
