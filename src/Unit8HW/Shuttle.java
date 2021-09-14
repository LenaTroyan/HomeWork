package Unit8HW;

class Shuttle implements IStart {

    @Override
    public boolean startCheck() {
        int a = (int) (Math.random() * 10);
        if (a > 3) {
            System.out.println("Проверка прошла успешно");
            return true;
        } else {
            System.out.println("Проверка провалилась");
            return false;
        }
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт шатла");
    }
}
