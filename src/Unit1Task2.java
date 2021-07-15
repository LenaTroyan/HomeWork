public class Unit1Task2 {
    public static void main (String[]  args) {
        int a=10;
        int b=23;
        int c=45;
        if (a<(b+c)) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
        if (b<(a+c)) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
        if (c<(a+b)) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }

    }
}
