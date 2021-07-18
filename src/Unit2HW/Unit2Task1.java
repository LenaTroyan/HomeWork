package Unit2HW;

public class Unit2Task1 {
    public static void main(String[] args){
        double a=10;
        double b=0.1;
        for (int i=1; i<=7; i++) {
            a+=b*a;
            System.out.println("День " +i+ " "+a);
        }
    }
}
