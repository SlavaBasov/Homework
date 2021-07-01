package lesson13_CollectionsPractice.store1.Utilits;

import lesson13_CollectionsPractice.store1.Product;

public class Comparator implements java.util.Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getPrice() > o2.getPrice()){
            return 1;
        } else if(o1.getPrice() < o2.getPrice()){
            return -1;
        } else {
            return 0;
        }
    }


}
