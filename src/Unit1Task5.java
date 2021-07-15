public class Unit1Task5 {
    public static void main (String[]  args) {
        int a = 10;
        int b=345;
        int c=-18;

        if (a>0 && b>0 && c>0) {System.out.println("3 положительных числа и 0 отрицательных чисел");
        } else if (a<0 && b>0 && c>0) {
            System.out.println("2 положительных числа и 1 отрицательное число");
        } else if (a>0 && b<0 && c>0) {
            System.out.println("2 положительных числа и 1 отрицательное число");
        } else if (a>0 && b>0 && c<0) {
            System.out.println("2 положительных числа и 1 отрицательное число");
        } else if (a>0 && b<0 && c<0) {
            System.out.println("1 положительное число и 2 отрицательных числа");
        } else if (a>0 && b<0 && c<0) {
            System.out.println("1 положительное число и 2 отрицательных числа");
        } else if (a<0 && b<0 && c>0) {
            System.out.println("1 положительное число и 2 отрицательных числа");
        } else if (a<0 && b>0 && c<0) {
            System.out.println("1 положительное число и 2 отрицательных числа");
        } else if (a<0 && b<0 && c<0) {
            System.out.println("0 положительных чисел и 3 отрицательных числа");}

    }
}
