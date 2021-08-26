package Unit8HW;


public class Task2 {

    public static void main(String[] args) {
        IStart Shuttle1= new Shuttle();
        IStart SpaceX1=new SpaceX();
        Cosmodrome Cosmodrome1= new Cosmodrome(Shuttle1, SpaceX1);
        Cosmodrome1.launch(Shuttle1);
        Cosmodrome1.launch(SpaceX1);
    }
}