package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.IHand;
import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.IHead;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.ILeg;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Robot implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;

    public Robot(IHead head, IHand hand, ILeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot() {
    }

    public Robot(SonyHand sonyHand, SonyHead sonyHead, ToshibaLeg toshibaLeg) {
        this.hand = sonyHand;
        this.head = sonyHead;
        this.leg = toshibaLeg;

    }

    public Robot(ToshibaHand toshibaHand, ToshibaHead toshibaHead, SonyLeg sonyLeg) {
        this.hand = toshibaHand;
        this.head = toshibaHead;
        this.leg = sonyLeg;
    }

    public Robot(SamsungHand samsungHand, SamsungHead samsungHead, SonyLeg sonyLeg) {
        this.hand = samsungHand;
        this.head = samsungHead;
        this.leg = sonyLeg;
    }

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    @Override
    public void action() {
        head.speek();
        hand.upHand();
        leg.step();

    }

    /**
     * Get the cost of a robot
     *
     * @return int
     */
    @Override
    public int getPrice() {
        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }


}
