package Unit1HW;

public class Unit1Task4 {
    public static void main (String[]  args) {
        int a = 10;
        int b=345;
        int c=-18;

        if (a>0 && b>0 && c>0) {System.out.println("3 положительных числа");
        } else if (a<0 && b>0 && c>0) {
            System.out.println("2 положительных числа");
        } else if (a>0 && b<0 && c>0) {
            System.out.println("2 положительных числа");
        } else if (a>0 && b>0 && c<0) {
            System.out.println("2 положительных числа");
        } else if (a>0 && b<0 && c<0) {
                System.out.println("1 положительное число");
        } else if (a>0 && b<0 && c<0) {
            System.out.println("1 положительное число");
        } else if (a<0 && b<0 && c>0) {
                System.out.println("1 положительное число");
        } else if (a<0 && b>0 && c<0) {
            System.out.println("1 положительное число");
        } else if (a<0 && b<0 && c<0) {
            System.out.println("0 положительных чисел");}

    }
}

