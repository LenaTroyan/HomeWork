package Unit6HW;

import java.util.Scanner;

class CivilAirTransport extends AirTransport {
    int numberOfPassenger;
    boolean businessClass;

    void displayInfo() {
        System.out.printf("Мощность: %f \nМаксимальная скорость: %f \nВес: %f\nМарка: %s\nРазмах крыльев: %f\nМинимальная длина взлетно-посадочной полосы: %f\n" +
                        "Вместимость пассажиров: %d\n",
                power, maxSpeed, weight, marks, wingspan, runwayStrip, numberOfPassenger);
    }

    void MaxNumberOfPassenger() {
        int maxNumberOfPassenger;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество пассажиров");
        maxNumberOfPassenger = sc.nextInt();
        if (maxNumberOfPassenger <= numberOfPassenger) {
            System.out.println("Самолет загружен");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }
}
