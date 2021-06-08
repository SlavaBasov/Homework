package lesson5_8_OOP.tasksInWord.task8;

public class Basket {
    private Product[] products;

    public Basket(Product... products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

}
