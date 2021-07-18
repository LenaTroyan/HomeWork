package Unit3HW;

import java.util.Random;

public class Unit3Task3 {
    public static void main(String[] args) {
        int mass[] = new int[15];
        int count = 0;
        Random random = new Random();
        System.out.println("Значения массива");
        for (int i = 0; i < 15; i++) {
            mass[i] = random.nextInt(100);
            System.out.print(mass[i] + " ");}
        System.out.println();
        for (int i = 0; i < 15; i++)
            { if (mass[i]%2==0) count++; }
        System.out.println(count);
    }
}
