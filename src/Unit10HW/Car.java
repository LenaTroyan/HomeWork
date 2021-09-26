package Unit10HW;

class Car {
    public Car(int speed, int price, String mark) {
        this.speed = speed;
        this.price = price;
        this.mark = mark;
    }

    int speed;
    int price;
    String mark;

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

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Car() {
    }

    public boolean start() throws myException {
        int a = (int) (Math.random() * 20);
        if (a % 2 != 0) {
            return true;
        } else {
            throw new myException("Ошибка", a);
        }
    }
}
