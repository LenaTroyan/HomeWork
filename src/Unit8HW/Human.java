package Unit8HW;

public class Human {
    private Jacket jacket;
    private Shoes shoes;
    private Trousers trousers;

    public Human(Jacket jacket, Shoes shoes, Trousers trousers) {
        this.jacket = jacket;
        this.trousers = trousers;
        this.shoes = shoes;
    }

    public Human() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Jacket getJacket() {
        return jacket;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public Trousers getTrousers() {
        return trousers;
    }

    public void setTrousers(Trousers trousers) {
        this.trousers = trousers;
    }

    public void putOnAll() {
        jacket.putOn();
        shoes.putOn();
        trousers.putOn();
        System.out.println("Вся одежда одета");

    }

    public void takeOffAll() {
        jacket.takeOff();
        shoes.takeOff();
        trousers.takeOff();
        System.out.println("Вся одежда снята");

    }
}
