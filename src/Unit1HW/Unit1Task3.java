package Unit1HW;

public class Unit1Task3 {
    public static void main (String[]  args) {
        int a = -78;

        if (a>0) {System.out.println("a+1 ="  + (a++));
        } else if (a<0) {
            System.out.println("a-2 =" +(a - 2));
        } else if (a==0) {
            System.out.println("a =" +(a = 10));
        }

    }
}
