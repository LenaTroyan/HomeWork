package Unit7HW.robot;

import Unit7HW.robot.hands.IHand;

public class SonyHand implements IHand {
    private int price;
    public SonyHand(int price) {this.price=price;}

    public SonyHand(){

    }

    public void upHand() {
        System.out.println ("Руку поднял Sony");

    }

    public int getPrice() {
        return price;
    }
}
