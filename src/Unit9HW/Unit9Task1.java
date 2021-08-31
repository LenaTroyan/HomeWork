package Unit9HW;

public class Unit9Task1 {
    public static void main(String [] args) {
        StringBuffer strBuffer = new StringBuffer("I love java");
        strBuffer.delete(0,11);
        System.out.println(strBuffer.toString());
    }
}
