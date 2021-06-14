package lesson5_8_OOP.lesson8.task4;

public class TeeShirt extends Clothes implements ManClothes, WomanClothes{
    public TeeShirt() {
    }

    public TeeShirt(Sizes sizes) {
        super(sizes);
    }

    public TeeShirt(Sizes sizes, double cost) {
        super(sizes, cost);
    }

    public TeeShirt(Sizes sizes, double cost, String color) {
        super(sizes, cost, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Мужчина одевает майку");
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина одевает майку");
    }

    @Override
    public String toString() {
        return "TeeShirt{" +
                "sizes=" + sizes +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }
}
