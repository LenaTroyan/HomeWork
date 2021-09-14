package Unit7HW.robot;

import Unit7HW.robot.heads.IHead;

public class SonyHead implements IHead {
    private int price;

    public SonyHead(int price) {
        this.price = price;
    }

    public SonyHead() {
    }

    public void speak() {
        System.out.println("Говорит голова Sony");
    }



    public int getPrice() {
        return price;
    }
}
