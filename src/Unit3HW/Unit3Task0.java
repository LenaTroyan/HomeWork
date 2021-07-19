package Unit3HW;

import java.util.Random;
import java.util.Scanner;

public class Unit3Task0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Длина массива");
        int n = sc.nextInt();
        System.out.println();
        Integer mass[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            mass[i] = r.nextInt(100);
        }
        System.out.println("Массив без изменений");
        for (int i = 0; i < n; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
    }
}
