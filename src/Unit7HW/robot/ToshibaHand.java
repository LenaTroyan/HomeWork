package Unit7HW.robot;

import Unit7HW.robot.hands.IHand;

public class ToshibaHand implements IHand {
    private int price;
    public ToshibaHand(int price) {this.price=price;}

    public ToshibaHand(){

    }

    public void upHand() {
        System.out.println ("Руку поднял Toshiba");

    }

    public int getPrice() {
        return price;
    }
}
