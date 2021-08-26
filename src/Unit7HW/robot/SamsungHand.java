package Unit7HW.robot;

import Unit7HW.robot.hands.IHand;

public class SamsungHand implements IHand {
    private int price;
    public SamsungHand(int price) {this.price=price;}

    public SamsungHand(){

    }

    public void upHand() {
        System.out.println ("Руку поднял Samsung");

    }

    public int getPrice() {
        return price;
    }
}