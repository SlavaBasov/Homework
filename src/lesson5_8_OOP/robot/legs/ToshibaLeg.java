package lesson5_8_OOP.robot.legs;

public class ToshibaLeg implements ILeg{
    private int price;

    public ToshibaLeg() {
    }

    public ToshibaLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Ноги Toshiba шагают");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
