package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.legs.SonyLeg;

public class Robot1 implements IRobot{
    private SamsungHand samsungHand;
    private SamsungHead samsungHead;
    private SonyLeg sonyLeg;

    public Robot1(SamsungHand samsungHand, SamsungHead samsungHead, SonyLeg sonyLeg) {
        this.samsungHand = samsungHand;
        this.samsungHead = samsungHead;
        this.sonyLeg = sonyLeg;
    }



    @Override
    public void action() {
        samsungHead.speek();
        samsungHand.upHand();
        sonyLeg.step();
    }

    @Override
    public int getPrice() {
        int price = samsungHand.getPrice() + samsungHead.getPrice() + sonyLeg.getPrice();
        return price;
    }

    public SamsungHand getSamsungHand() {
        return samsungHand;
    }

    public void setSamsungHand(SamsungHand samsungHand) {
        this.samsungHand = samsungHand;
    }

    public SamsungHead getSamsungHead() {
        return samsungHead;
    }

    public void setSamsungHead(SamsungHead samsungHead) {
        this.samsungHead = samsungHead;
    }

    public SonyLeg getSonyLeg() {
        return sonyLeg;
    }

    public void setSonyLeg(SonyLeg sonyLeg) {
        this.sonyLeg = sonyLeg;
    }
}
