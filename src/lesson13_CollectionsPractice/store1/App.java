package lesson13_CollectionsPractice.store1;

import lesson13_CollectionsPractice.store1.Utilits.Comparator;
import lesson13_CollectionsPractice.store1.Utilits.Type;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        Shop shop = new Shop(new ArrayList<>());
        shop.products.add(new Product(1, "TVset", 1500, Type.Special));
        shop.products.add(new Product(2, "Computer", 2000, Type.Bestseller));
        shop.products.add(new Product(3, "Phone", 800, Type.Regular));
        shop.products.add(new Product(4, "Watch", 500, Type.Special));

        for(int i = shop.getProducts().size() - 1; i >= 0; i--){
            System.out.println(shop.products.get(i).toString());
        }

        Collections.reverse(shop.getProducts());

        shop.showAll();
        System.out.println("____________________________");

        System.out.println("____________________________");

        shop.showAll();
        System.out.println("____________________________");

        Comparator comparator = new Comparator();
        Collections.sort(shop.getProducts(), comparator);
        shop.showAll();

        System.out.println(shop.deleteProduct(1));

        System.out.println("____________________________");
        shop.showAll();

        shop.addProduct(new Product(4, "Watch", 500, Type.Special));

        System.out.println("____________________________");
        shop.showAll();

        shop.editProduct(new Product(4, "AppleWatch", 750, Type.Bestseller));

        System.out.println("____________________________");
        shop.showAll();











    }
}
