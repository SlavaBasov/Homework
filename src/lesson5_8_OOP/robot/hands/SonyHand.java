package lesson5_8_OOP.robot.hands;

public class SonyHand implements IHand{
    private int price;

    public SonyHand() {
    }

    public SonyHand(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Рука Sony поднимается");
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
