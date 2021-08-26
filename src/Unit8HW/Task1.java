package Unit8HW;

public class Task1 {
    public static void main(String[] args) {
        Jacket Human1Jacket = new Jacket() {
            @Override
            public void putOn() {}

            @Override
            public void takeOff() {}
        };
        Trousers Human1Trousers = new Trousers() {
            @Override
            public void putOn() {}

            @Override
            public void takeOff() {}
        };
        Shoes Human1Shoes = new Shoes() {
            @Override
            public void putOn() {}

            @Override
            public void takeOff(){}
        };
        Human Human1 = new Human(Human1Jacket, Human1Shoes, Human1Trousers);
        Human1.putOnAll();
        Human1.takeOffAll();
    }
}
