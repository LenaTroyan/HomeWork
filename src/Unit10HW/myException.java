package Unit10HW;

class myException extends Exception {
    private final int number;


    public int getNumber() {
        return number;
    }

    public myException(String message, int num) {
        super(message);
        number = num;
    }




}
