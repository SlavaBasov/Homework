package lesson10.task1.exceptions;

public class OddNumberException extends Exception{
    private final int number;
    private final String brand;

    public OddNumberException(int number, String brand) {
        this.number = number;
        this.brand = brand;
    }

    public int getNumber() {
        return number;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "OddNumberException{" +
                "number=" + number +
                ", brand='" + brand + '\'' +
                '}';
    }
}
