package Unit7HW.robot;

import Unit7HW.robot.legs.ILeg;

public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {
    }

    public void step() {
        System.out.println("Samsung шагает");

    }

    public int getPrice() {
        return price;
    }
}