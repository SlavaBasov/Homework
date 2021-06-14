package lesson5_8_OOP.lesson8.task4;

public class Tie extends Clothes implements ManClothes{
    public Tie() {
    }

    public Tie(Sizes sizes) {
        super(sizes);
    }

    public Tie(Sizes sizes, double cost) {
        super(sizes, cost);
    }

    public Tie(Sizes sizes, double cost, String color) {
        super(sizes, cost, color);
    }

    @Override
    public void dressMen() {

    }

    @Override
    public String toString() {
        return "Tie{" +
                "sizes=" + sizes +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }
}
