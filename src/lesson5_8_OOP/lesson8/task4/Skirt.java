package lesson5_8_OOP.lesson8.task4;

public class Skirt extends Clothes implements WomanClothes{
    public Skirt() {
    }

    public Skirt(Sizes sizes) {
        super(sizes);
    }

    public Skirt(Sizes sizes, double cost) {
        super(sizes, cost);
    }

    public Skirt(Sizes sizes, double cost, String color) {
        super(sizes, cost, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина одевает юбку");
    }

    @Override
    public String toString() {
        return "Skirt{" +
                "sizes=" + sizes +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }
}
