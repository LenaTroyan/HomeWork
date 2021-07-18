package Unit3HW;

import java.util.Random;

public class Unit3Task6 {
    public static void main(String[] args) {
        int mass[] = new int[4];
        Random random = new Random();
        System.out.println("Значения массива");
        for (int i = 0; i < 4; i++) {
            mass[i] = random.nextInt(10);
            System.out.print(mass[i] + " ");}
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            if(i>0){
                if(mass[i-1]>=mass[i]){
                    System.out.println("Прогрессия не возрастающая");
                    break;
                }
            }
            if(i==mass.length-1){
                System.out.println("Прогрессия строго возрастающая");
        }
        }
    }
}
