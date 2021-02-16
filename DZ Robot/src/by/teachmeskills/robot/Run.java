package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

import java.util.LinkedList;
import java.util.List;

public class Run {
    public static List<Robot> robots = new LinkedList();

    public static void main(String[] args) {
        /**
         Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
         Класс SonyHead является примером реализацией головы от Sony.
         Создайте 3 робота с разными комплектующими.
         Например у робота голова и нога от Sony а, рука от Samsung.
         У всех роботов вызовите метод action.
         Среди 3-х роботов найдите самого дорогого.
         */
        GetMaxPriceofRobot getMaxPriceofRobot = new GetMaxPriceofRobot();
        SamsungHand samsungHand = new SamsungHand();
        SamsungHead samsungHead = new SamsungHead();
        SonyLeg sonyLeg = new SonyLeg();
        SonyHead sonyHead = new SonyHead();
        SonyHand sonyHand = new SonyHand();
        ToshibaHead toshibaHead = new ToshibaHead();
        ToshibaHand toshibaHand = new ToshibaHand();
        ToshibaLeg toshibaLeg = new ToshibaLeg();

        Robot robot1 = new Robot(samsungHead, samsungHand, sonyLeg);
        Robot robot2 = new Robot(toshibaHead, toshibaHand, sonyLeg);
        Robot robot3 = new Robot(sonyHead, sonyHand, toshibaLeg);
        robots.add(robot1);
        robots.add(robot2);
        robots.add(robot3);
        System.out.println("Первый робот:");
        robot1.action();
        System.out.println("Второй робот:");
        robot2.action();
        System.out.println("Третий робот:");
        robot3.action();
        getMaxPriceofRobot.calcprice();
    }
}
