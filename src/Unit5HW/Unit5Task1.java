package Unit5HW;

import java.util.Scanner;
import java.lang.Math;

class Computer {

    String processor;
    String ram;
    String hdd;
    int workCycle = 3;

    void displayInfo() {
        System.out.printf("Processor: %s \tram: %s \thdd: %s\tworkCycle %d\n", processor, ram, hdd, workCycle);
    }

    void onComputer() {
        int userNumber;
        int Random;
        Scanner sc = new Scanner(System.in);
        Random = (int) (Math.random() * 2);
        System.out.println("Для включения компьютера введите 0 или 1");
        userNumber = sc.nextInt();
        if (userNumber == Random) {
            workCycle--;
            System.out.println("Компьютер включен ");
        } else {
            System.out.println("Компьютер сгорел");
        }
    }

    void offComputer() {
        int userNumber;
        int Random;
        Scanner sc = new Scanner(System.in);
        Random = (int) (Math.random() * 2);
        System.out.println("Для выключения компьютера введите 0 или 1");
        userNumber = sc.nextInt();
        if (userNumber == Random) {
            workCycle--;
            System.out.println("Компьютер выключен ");
        } else {
            System.out.println("Компьютер сгорел");
        }
    }

    void dieComputer() {
        if (workCycle == 0) {
            System.out.println("Компьютер сгорел");
        } else {
            System.out.println("Осталось попыток включений/выключений " + workCycle);
        }
    }
}

public class Unit5Task1 {
    public static void main(String[] args) {
        Computer one = new Computer();
        one.processor = "Intel (R) Core (TM) i5-7200U";
        one.ram = "8Gb";
        one.hdd = "1000Gb";
        one.workCycle = 3;
        one.displayInfo();
        one.onComputer();
        one.offComputer();
        one.dieComputer();
    }
}
