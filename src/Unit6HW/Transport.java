package Unit6HW;

class Transport {

    double power;
    double maxSpeed;
    double weight;
    String marks;
    void powerInKvt(){
        double powerInKvt=0.74*power;
        System.out.println("Мощность в киловаттах "+powerInKvt);
    }
}
