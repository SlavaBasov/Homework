package lesson5_8_OOP.lesson8.task4;

public abstract class Clothes {
    Sizes sizes;
    double cost;
    String color;

    public Clothes() {
    }

    public Clothes(Sizes sizes) {
        this.sizes = sizes;
    }

    public Clothes(Sizes sizes, double cost) {
        this.sizes = sizes;
        this.cost = cost;
    }

    public Clothes(Sizes sizes, double cost, String color) {
        this.sizes = sizes;
        this.cost = cost;
        this.color = color;
    }

    public Sizes getSizes() {
        return sizes;
    }

    public void setSizes(Sizes sizes) {
        this.sizes = sizes;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "sizes=" + sizes +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }

}
