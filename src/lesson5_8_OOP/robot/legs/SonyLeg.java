package lesson5_8_OOP.robot.legs;

public class SonyLeg implements ILeg{
    private int price;

    public SonyLeg() {
    }

    public SonyLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Ноги Sony шагают");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
