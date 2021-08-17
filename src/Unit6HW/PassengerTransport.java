package Unit6HW;

import java.util.Scanner;

class PassengerTransport extends LandTransport {
    int numberOfPassenger;
    String carcaseType;
    double distance;

    void displayInfo() {
        System.out.printf("Мощность: %f \nМаксимальная скорость: %f \nВес: %f\nМарка: %s\tТип каркаса: %s\tКоличество пассажиров: %d\nКоличество колес: %d\n", power, maxSpeed, weight, marks, carcaseType, numberOfPassenger,numberOfWheel);
    }

    private double FuelConsumption() {
        double fuelConsumption = distance * 0.063;
        return fuelConsumption;
    }

    public void SpeedCar() {
        double time;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите время, которое двигался автомобиль ");
        time = sc.nextInt();
        distance = time * maxSpeed;
        System.out.println("За время " + time + " ч, автомобиль " + marks + " двигаясь с максимальной скоростью " + maxSpeed + " км/ч и проедет " + distance + " км и израсходует "
                + FuelConsumption() + " литров топлива");
    }


}
