package Unit11HW;

import java.io.Serializable;

class Car implements Serializable {
    private String marks;
    int speed;
    int price;

    public Car(String marks, int speed, int price) {
        this.marks = marks;
        this.speed = speed;
        this.price = price;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}




