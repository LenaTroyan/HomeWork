public class Unit1Task1 {
    public static void main (String[]  args) {
        int x = -364;
        if (x>0 && x<10 ) {System.out.println(" Это однозначное положительное число ");
        } else if (x>=10 && x<100) {
            System.out.println("Это положительное двухзначное число ");
        } else if (x>=100 && x<1000) {
            System.out.println("Это положительное трехзначное число ");
        } else if (x>=1000 && x<10000) {
            System.out.println("Это положительное четырехзначное число ");
        } else if (x>=10000 && x<100000) {
            System.out.println("Это положительное пятизначное число ");}

           else if (x<0 && x>-10 ) {System.out.println(" Это однозначное отрицательное число ");
            } else if (x<=-10 && x>-100) {
                System.out.println("Это отрицательное двухзначное число ");
            } else if (x<=-100 && x>-1000) {
                System.out.println("Это отрицательное трехзначное число ");
            } else if (x<=-1000 && x>-10000) {
                System.out.println("Это отрицательное четырехзначное число ");
            } else if (x<=-10000 && x>-100000) {
                System.out.println("Это отрицательное пятизначное число ");}

    }
}
