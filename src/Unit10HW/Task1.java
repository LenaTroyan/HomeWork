package Unit10HW;

public class Task1 {
    public static void main(String[] args) {
        Car Car1=new Car();
        try {
            Car1.start();
            System.out.println("Машина 1 завелась");
        } catch ( myException ex){
            System.out.println("Машина 1 не завелась");
        }
        Car Car2=new Car();
        try {
            Car2.start();
            System.out.println("Машина 2 завелась");
        } catch ( myException ex){
            System.out.println("Машина 2 не завелась");
        }
        Car Car3=new Car();
        try {
            Car3.start();
            System.out.println("Машина 3 завелась");
        } catch ( myException ex){
            System.out.println("Машина 3 не завелась");
        }
    }
    }

