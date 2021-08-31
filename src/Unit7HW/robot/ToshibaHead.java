package Unit7HW.robot;

import Unit7HW.robot.heads.IHead;

public class ToshibaHead implements IHead {
    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    public ToshibaHead() {
    }

    public void speak() {
        System.out.println("Говорит голова Toshiba");
    }



    public int getPrice() {
        return price;
    }
}
