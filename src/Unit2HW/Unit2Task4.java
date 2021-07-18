package Unit2HW;

import java.util.Scanner;

public class Unit2Task4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число A");
        int a = in.nextInt();
        System.out.print("Введите число B");
        int b = in.nextInt();
        int count=0;
        int i=0;
       do{ count+=a;
           i++;}
       while (i<b);
       System.out.println("Произведение A*B "+count);
    }
}
