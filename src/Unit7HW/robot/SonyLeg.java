package Unit7HW.robot;

import Unit7HW.robot.legs.ILeg;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    public void step() {
        System.out.println("Sony шагает");

    }

    public int getPrice() {
        return price;
    }
}
