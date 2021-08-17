package Unit7HW.robot;

import Unit7HW.robot.legs.ILeg;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }

    public void step() {
        System.out.println("Toshiba шагает");

    }

    public int getPrice() {
        return price;
    }
}
