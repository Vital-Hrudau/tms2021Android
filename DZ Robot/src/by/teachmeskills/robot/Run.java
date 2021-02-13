package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {
    private int price;

    public static void main(String[] args) {
        /**
         Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
         Класс SonyHead является примером реализацией головы от Sony.
         Создайте 3 робота с разными комплектующими.
         Например у робота голова и нога от Sony а, рука от Samsung.
         У всех роботов вызовите метод action.
         Среди 3-х роботов найдите самого дорогого.
         */
        SamsungHand samsungHand = new SamsungHand();
        SamsungHead samsungHead = new SamsungHead();
        SonyLeg sonyLeg = new SonyLeg();
        SonyHead sonyHead = new SonyHead();
        SonyHand sonyHand = new SonyHand();
        ToshibaHead toshibaHead = new ToshibaHead();
        ToshibaHand toshibaHand = new ToshibaHand();
        ToshibaLeg toshibaLeg = new ToshibaLeg();

        Robot1 robot1 = new Robot1(samsungHand, samsungHead, sonyLeg);
        Robot2 robot2 = new Robot2(toshibaHand, toshibaHead, sonyLeg);
        Robot3 robot3 = new Robot3(sonyHand, sonyHead, toshibaLeg);
        robot1.action();
        robot2.action();
        robot3.action();
        if (robot1.getPrice() > robot2.getPrice() && robot1.getPrice() > robot3.getPrice()) {
            System.out.println("Самый дорогой робот #1");
        }
        if (robot2.getPrice() > robot1.getPrice() && robot2.getPrice() > robot3.getPrice()) {
            System.out.println("Самый дорогой робот #2");
        }
        if (robot3.getPrice() > robot1.getPrice() && robot3.getPrice() > robot2.getPrice()) {
            System.out.println("Самый дорогой робот #3");
        }

    }
}
