package lesson5_8_OOP.robot.heads;

public class SonyHead implements IHead {
    private int price;

    public SonyHead() {
    }

    public SonyHead(int price) {
        this.price = price;
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
