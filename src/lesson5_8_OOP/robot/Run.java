package lesson5_8_OOP.robot;

import lesson5_8_OOP.robot.hands.IHand;
import lesson5_8_OOP.robot.hands.SamsungHand;
import lesson5_8_OOP.robot.hands.SonyHand;
import lesson5_8_OOP.robot.hands.ToshibaHand;
import lesson5_8_OOP.robot.heads.IHead;
import lesson5_8_OOP.robot.heads.SamsungHead;
import lesson5_8_OOP.robot.heads.SonyHead;
import lesson5_8_OOP.robot.heads.ToshibaHead;
import lesson5_8_OOP.robot.legs.ILeg;
import lesson5_8_OOP.robot.legs.SamsungLeg;
import lesson5_8_OOP.robot.legs.SonyLeg;
import lesson5_8_OOP.robot.legs.ToshibaLeg;
/*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

public class Run {
    public static void main(String[] args) {
        Robot[] robots;
        int maxPrice;
        int maxIndex;

        IHand samsungHand = new SamsungHand(900);
        IHand sonyHand = new SonyHand(800);
        IHand toshibaHand = new ToshibaHand(700);
        IHead samsungHead = new SamsungHead(1500);
        IHead sonyHead = new SonyHead(1600);
        IHead toshibaHead = new ToshibaHead(1650);
        ILeg samsungLeg = new SamsungLeg(800);
        ILeg sonyLeg = new SonyLeg(900);
        ILeg toshibaLeg = new ToshibaLeg(800);

        Robot robot1 = new Robot(samsungHead, toshibaHand, sonyLeg);
        Robot robot2 = new Robot(sonyHead, samsungHand, toshibaLeg);
        Robot robot3 = new Robot(toshibaHead, sonyHand, samsungLeg);
        robots = new Robot[]{robot1, robot2, robot3};
        maxPrice = robots[0].getPrice();
        maxIndex = 0;

        /*for (Robot robot: robots){
            robot.action();
            System.out.println();
            System.out.println("Cost of robot: " + robot.getPrice());
            if(robot.getPrice() > maxPrice){
                maxPrice = robot.getPrice();
            }
        }*/
        for (int i = 0; i < robots.length; i++) {
            robots[i].action();
            System.out.println("Price of robot" + (i + 1) + ": " + robots[i].getPrice() + "\n");
            if(robots[i].getPrice() > maxPrice){
                maxPrice = robots[i].getPrice();
                maxIndex = i;
            }
        }

        System.out.println("Max price: robot" + (maxIndex + 1) + "   " + robots[maxIndex].getPrice());









    }
}
