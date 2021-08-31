package Unit8HW;


public class Task2 {

    public static void main(String[] args) {
        IStart Shuttle1= new Shuttle();
        IStart SpaceX1=new SpaceX();
        Cosmodrome Cosmodrome2= new Cosmodrome(Shuttle1, SpaceX1);
        Cosmodrome2.launch(Shuttle1);
        Cosmodrome2.launch(SpaceX1);
    }
}