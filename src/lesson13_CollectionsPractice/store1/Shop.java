package lesson13_CollectionsPractice.store1;

import java.util.Iterator;
import java.util.List;

public class Shop {
    List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }

    public boolean addProduct(Product product){
        if(!products.contains(product)){
            return products.add(product);
        } else {
            return false;
        }
    }

    public void showAll(){
        for(Product p: products){
            System.out.println(p);
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public boolean deleteProduct(int id){
        Iterator<Product> iterator = products.iterator();
        boolean result = false;

        while (iterator.hasNext()){
            if(iterator.next().getId() == id){
                iterator.remove();
                result = true;
            }
        }
        return result;
    }

    public boolean editProduct(Product p){
        boolean result = false;
        for (Product prod: products){
            if(prod.getId() == p.getId()){
                prod.setPrice(p.getPrice());
                prod.setName(p.getName());
                prod.setType(p.getType());
                result = true;
            }
        }
        return result;
    }


}
