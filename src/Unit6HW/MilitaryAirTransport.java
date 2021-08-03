package Unit6HW;


class MilitaryAirTransport extends AirTransport {
    int numberOfRocket;
    boolean ejectionSystem;

    void displayInfo() {
        System.out.printf("Мощность: %f \nМаксимальная скорость: %f \nВес: %f\nМарка: %s\nРазмах крыльев: %f\nМинимальная длина взлетно-посадочной полосы: %f\n" +
                        "Количество ракет: %d\n",
                power, maxSpeed, weight, marks, wingspan, runwayStrip, numberOfRocket);
    }

    void Rockets() {
        if (numberOfRocket > 0) {
            System.out.println("Ракета пошла...");
        } else {
            System.out.println("Боеприпасы отсутствуют...");
        }
    }

    void EjectionSystem() {
        if (ejectionSystem = true) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
