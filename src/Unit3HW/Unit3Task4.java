package Unit3HW;

import java.util.Random;

public class Unit3Task4 {
    public static void main(String[] args) {
        int mass[] = new int[20];
        int count = 0;
        Random random = new Random();
        System.out.println("Значения массива");
        for (int i = 0; i < 20; i++) {
            mass[i] = random.nextInt(20);
            System.out.print(mass[i] + " ");}
        System.out.println();
            for (int i = 0; i < mass.length; i++) {
                if (i % 2== 0) {
                    mass[i] = 0; }
                System.out.print(mass[i] + " ");
            }
    }
}
