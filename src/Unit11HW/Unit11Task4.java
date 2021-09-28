package Unit11HW;

import java.io.*;

public class Unit11Task4 {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Car.dat"))){
            Car audi= new Car("A100", 300, 50000);
            oos.writeObject(audi);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("car.dat"))){
            Car audi=(Car)ois.readObject();
            System.out.println(audi.getPrice() +" "+audi.getSpeed());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
