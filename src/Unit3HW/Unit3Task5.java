package Unit3HW;

import java.util.Random;

public class Unit3Task5 {
    public static void main(String[] args) {
        int mass1[] = new int[5];
        int mass2[] = new int[5];
        Random random = new Random();
        System.out.println("Значения массива 1");
        for (int i = 0; i < 5; i++) {
            mass1[i] = random.nextInt(15);
            System.out.print(mass1[i] + " ");}
        System.out.println();
        System.out.println("Значения массива 2");
        for (int i = 0; i < 5; i++) {
            mass2[i] = random.nextInt(15);
            System.out.print(mass2[i] + " ");}
        int a1=0;
        int a2=0;
        for (int i = 0; i < 5; i++){
            a1+=mass1[i];
            a2+=mass2[i];
        }
        System.out.println();
        if (a1/mass1.length>a2/mass2.length){
            System.out.println("Среднее арифметическое массива 1 больше массива 2");
        } else if (a1/ mass1.length<a2/ mass2.length){
            System.out.println("Среднее арифметическое массива 2 больше массива 1");}
            else {
                System.out.println("Средние арифметические массивов равны");
            }
    }
}
