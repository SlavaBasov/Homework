package lesson5_8_OOP.robot.hands;

public class ToshibaHand implements IHand{
    private int price;

    public ToshibaHand() {
    }

    public ToshibaHand(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Рука Toshiba поднимается");
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
