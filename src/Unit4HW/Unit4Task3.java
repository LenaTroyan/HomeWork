package Unit4HW;

import java.util.Random;
import java.util.Scanner;

public class Unit4Task3 {
    public static void main(String[] args) {
        System.out.println("Введите размерность матрицы");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n;
        n = sc.nextInt();
        int mass[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j] = r.nextInt(50);
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        int a1 = 1;
        for (int i = 0; i < n; i++) {
            int j = i;
            a1 *= mass[i][j];
        }
        int a2 = 1;
        for (int i = 0; i < mass.length; i++) {
            int j = mass.length - 1 - i;
            a2 *= mass[i][j];
        }
        if (a1 > a2) {
            System.out.println("Произведение элементов главной диагонали больше");
        } else if (a1 < a2) {
            System.out.println("Произведение элементов побочной диагонали больше");
        } else {
            System.out.println("Произведения диагоналей равны");
        }
    }
}