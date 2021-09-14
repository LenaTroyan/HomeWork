package Unit9HW;

public class Unit9Task2 {
    public static void main(String[] args) {
        StringBuffer strBuffer = new StringBuffer("I love java");
        char c= strBuffer.charAt(3);
        strBuffer.setCharAt(0,c);
        System.out.println(strBuffer.toString());
    }
}