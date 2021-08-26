package Unit8HW;

public class SpaceX implements IStart{
    @Override
    public boolean startCheck() {
        int a = (int) (Math.random() * 20);
        if (a < 10 ) {
            System.out.println("Проверка прошла успешно");
            return true;
        } else {
            System.out.println("Проверка провалилась");
            return false;
        }
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX");
    }
}
