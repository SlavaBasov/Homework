package lesson4_5.tasksInWord.task8;

import java.util.Arrays;

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
