package Unit7HW.robot;


import Unit7HW.robot.hands.IHand;
import Unit7HW.robot.heads.IHead;
import Unit7HW.robot.legs.ILeg;

public class Run {


    public static void main(String[] args) {
        IHand Robot1Hand = new SamsungHand(10);
        IHead Robot1Head = new SonyHead(20);
        ILeg Robot1Leg = new ToshibaLeg(30);
        IRobot Robot1 = new Robot(Robot1Head, Robot1Hand, Robot1Leg);
        Robot1.getPrice();
        Robot1.action();
        System.out.println("Стоимость Robot1 " + Robot1.getPrice());

        IHand Robot2Hand = new SonyHand(35);
        IHead Robot2Head = new ToshibaHead(5);
        ILeg Robot2Leg = new ToshibaLeg(30);
        IRobot Robot2 = new Robot(Robot2Head, Robot2Hand, Robot2Leg);
        System.out.println();
        Robot2.getPrice();
        Robot2.action();
        System.out.println("Стоимость Robot2 " + Robot2.getPrice());

        IHand Robot3Hand = new ToshibaHand(68);
        IHead Robot3Head = new SamsungHead(75);
        ILeg Robot3Leg = new SonyLeg(34);
        IRobot Robot3 = new Robot(Robot3Head, Robot3Hand, Robot3Leg);
        System.out.println();
        Robot3.getPrice();
        Robot3.action();
        System.out.println("Стоимость Robot3 " + Robot3.getPrice());

        if(Robot1.getPrice()>Robot2.getPrice() && Robot1.getPrice()>Robot3.getPrice()){
            System.out.println("Robot1 самый дорогой");
        } else if (Robot2.getPrice()>Robot1.getPrice() && Robot2.getPrice()>Robot3.getPrice()){
            System.out.println("Robot2 самый дорогой");
        } else if (Robot3.getPrice()>Robot1.getPrice() && Robot3.getPrice()>Robot1.getPrice()){
            System.out.println("Robot3 самый дорогой");
        }
    }
}