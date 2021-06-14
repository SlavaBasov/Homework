package lesson5_8_OOP.robot.hands;

public class SamsungHand implements IHand{
    private int price;

    public SamsungHand() {
    }

    public SamsungHand(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Рука Samsung поднимается");
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
