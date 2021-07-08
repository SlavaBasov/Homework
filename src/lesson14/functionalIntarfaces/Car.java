package lesson14.functionalIntarfaces;

public class Car implements Optional{
    private String name;
    private int price;
    private boolean isFullDrive;

    public Car() {
    }

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Car(String name, int price, boolean isFullDrive) {
        this.name = name;
        this.price = price;
        this.isFullDrive = isFullDrive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public void test() {

    }

    public boolean isFullDrive(){
        return isFullDrive;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", isFullDrive=" + isFullDrive +
                '}';
    }
}
