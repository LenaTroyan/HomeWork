package Unit6HW;

import java.util.Scanner;

class FreightTransport extends LandTransport {
    double liftingCapacity;

    void displayInfo() {
        System.out.printf("Мощность: %f \nМаксимальная скорость: %f \nВес: %f\nМарка: %s\nГрузоподъемность: %f\nКоличество колес: %d\nРасход топлива: %f\n",
                power, maxSpeed, weight, marks, liftingCapacity,numberOfWheel,fuelConsumption);
    }

    void MaxLiftingCapacity() {
        double maxLiftingCapacity;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество груза,т");
        maxLiftingCapacity = sc.nextInt();
        if (maxLiftingCapacity <= liftingCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }

}
