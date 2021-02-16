package by.teachmeskills.robot;

import static by.teachmeskills.robot.Run.robots;

public class GetMaxPriceofRobot {
    public void calcprice() {
        int max = robots.get(0).getPrice();
        for (Robot robot : robots) {
            System.out.println(robot.getPrice());
            max = Math.max(max, robot.getPrice());
        }
        System.out.println("Самый дорогой робот стоит:  " + max);
    }
}
