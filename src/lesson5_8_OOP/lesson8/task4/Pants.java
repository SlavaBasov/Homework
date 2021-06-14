package lesson5_8_OOP.lesson8.task4;

public class Pants extends Clothes implements ManClothes, WomanClothes{
    public Pants() {
    }

    public Pants(Sizes sizes) {
        super(sizes);
    }

    public Pants(Sizes sizes, double cost) {
        super(sizes, cost);
    }

    public Pants(Sizes sizes, double cost, String color) {
        super(sizes, cost, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Мужчина одевает штаны");
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина одевает штаны");
    }

    @Override
    public String toString() {
        return "Pants{" +
                "sizes=" + sizes +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }
}
