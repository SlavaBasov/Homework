package lesson13_CollectionsPractice.store2.utilits;

public class Type {
    private String name;
    private int discount;

    public Type() {
    }

    public Type(String name, int discount) {
        this.name = name;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
