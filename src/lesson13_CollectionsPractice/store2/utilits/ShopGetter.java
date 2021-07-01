package lesson13_CollectionsPractice.store2.utilits;

import lesson13_CollectionsPractice.store2.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

public class ShopGetter {
    private TreeMap<String, Type> types = new TreeMap<>();
    private ArrayList<Product> products = new ArrayList<>();

    public ShopGetter() {
    }

    public ShopGetter(String fileNameTypes, String fileNameProducts) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileNameTypes))){
            Iterator<String> iterator = reader.lines().iterator();
            types = new TreeMap<>();
            String[] resultLine;
            while (iterator.hasNext()){
                resultLine = iterator.next().split(" ");
                types.put(resultLine[0], (new Type(resultLine[0], Integer.parseInt(resultLine[1]))));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileNameProducts))){
            Iterator<String> iterator = reader.lines().iterator();
            products = new ArrayList<>();
            String[] resultLine;
            getTypes();
            if(iterator.hasNext()){
            iterator.next();
            }

            while (iterator.hasNext()){
                resultLine = iterator.next().split("\\s+");
                products.add(new Product(Integer.parseInt(resultLine[0]), resultLine[1], Integer.parseInt(resultLine[2]), types.get(resultLine[3])));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public TreeMap<String, Type> getTypes() {
        return types;
    }

    public void setTypes(TreeMap<String, Type> types) {
        this.types = types;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
