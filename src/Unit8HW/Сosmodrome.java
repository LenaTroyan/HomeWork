package Unit8HW;

class Cosmodrome {
    public Cosmodrome(Shuttle shuttle1, SpaceX spaceX1) {
    }

    public Cosmodrome(IStart shuttle1, IStart spaceX1) {
    }

    void launch(IStart start1) {
        if (start1.startCheck()) {
            start1.engineStart();
            for (int i = 10; i > 0; i--) {
                System.out.println(+i);
            }
            start1.start();
        } else {
            System.out.println("Предстартовая проверка провалена");
        }
    }
}
