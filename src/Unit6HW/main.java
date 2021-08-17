package Unit6HW;

public class main {
    public static void main(String[] args) {
        PassengerTransport Audi = new PassengerTransport();
        Audi.power = 355.6;
        Audi.maxSpeed = 250;
        Audi.weight = 1500;
        Audi.marks = "Audi A5";
        Audi.numberOfPassenger = 5;
        Audi.numberOfWheel = 4;
        Audi.carcaseType = "Cabriolet";
        Audi.displayInfo();
        Audi.powerInKvt();
        Audi.SpeedCar();

        System.out.println();

        FreightTransport MAZ = new FreightTransport();
        MAZ.power = 420;
        MAZ.maxSpeed = 150;
        MAZ.weight = 3000;
        MAZ.marks = "МАЗ 6430";
        MAZ.liftingCapacity = 52;
        MAZ.fuelConsumption = 500;
        MAZ.numberOfWheel = 6;
        MAZ.displayInfo();
        MAZ.powerInKvt();
        MAZ.MaxLiftingCapacity();

        System.out.println();

        CivilAirTransport Airbus = new CivilAirTransport();
        Airbus.power=1000;
        Airbus.maxSpeed=900;
        Airbus.weight=42600;
        Airbus.marks="Airbus A320";
        Airbus.numberOfPassenger=180;
        Airbus.wingspan=34.1;
        Airbus.runwayStrip=2000;
        Airbus.displayInfo();
        Airbus.powerInKvt();
        Airbus.MaxNumberOfPassenger();

        System.out.println();

        MilitaryAirTransport SU27 = new MilitaryAirTransport();
        SU27.power=2000;
        SU27.maxSpeed=2500;
        SU27.weight=16000;
        SU27.marks="СУ 27";
        SU27.wingspan=14.7;
        SU27.runwayStrip=2000;
        SU27.numberOfRocket=3;
        SU27.ejectionSystem=true;
        SU27.displayInfo();
        SU27.powerInKvt();
        SU27.Rockets();
        SU27.EjectionSystem();
    }
}
