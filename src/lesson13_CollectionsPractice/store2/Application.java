package lesson13_CollectionsPractice.store2;

import lesson13_CollectionsPractice.store2.utilits.Action;
import lesson13_CollectionsPractice.store2.utilits.Type;
import lesson13_CollectionsPractice.store2.utilits.ShopGetter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class Application {
    public static void main(String[] args) {
        ShopGetter shopGetter = new ShopGetter("lesson13CollectionsFiles/Types.txt", "lesson13CollectionsFiles/Products.txt");
        Shop shop = new Shop(shopGetter.getProducts());
        Action.action("lesson13CollectionsFiles/Action.txt", shop, shopGetter);




    }
}
