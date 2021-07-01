package lesson13_CollectionsPractice.store2.utilits;

import lesson13_CollectionsPractice.store2.Product;
import lesson13_CollectionsPractice.store2.Shop;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Action {
    public static void action(String path, Shop shop, ShopGetter shopGetter) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            Iterator<String> iterator = reader.lines().iterator();
            ArrayList<String> list = new ArrayList<>();
            String line;
            String[] lines;

            while (iterator.hasNext()) {
                line = iterator.next();
                if (line.startsWith("show all")) {
                    shop.showAll();
                } else if (line.startsWith("add")) {
                    lines = line.split("\\s+|(,+\\s+)|\\(|\\)");
                    if(shop.addProduct(new Product(Integer.parseInt(lines[1]), lines[2], Integer.parseInt(lines[3]), shopGetter.getTypes().get(lines[4])))){
                        System.out.println("Объект " + lines[2] + " успешно добавлен");
                        writeAddedObject(shop.getProducts().get(shop.getProducts().size() - 1));
                    } else {
                        System.out.println("Объект " + lines[2] + " уже есть");
                    }
                } /*else if (line.startsWith("edit")) {
                    lines = line.split("\\s+|(,+\\s+)|\\(|\\)");
                    if(shop.editProduct(new Product(Integer.parseInt(lines[1]), lines[2], Integer.parseInt(lines[3]), shopGetter.getTypes().get(lines[4])))){
                        System.out.println("Объект " + lines[1] + " успешно изменен");
                        //editAddedObject(shopGetter.getProducts().get(Integer.parseInt(lines[1])));
                    } else {
                        System.out.println("Объект " + lines[1] + " отсутствует");
                    }
                } else if(line.startsWith("delete")){
                    lines = line.split("\\s+|(,+\\s+)|\\(|\\)");
                    if(shop.deleteProduct(Integer.parseInt(lines[1]))){
                        System.out.println("Объект " + lines[1] + " успешно удален");
                    } else {
                        System.out.println("Объект " + lines[1] + " отсутствует");
                    }
                }*/

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void writeAddedObject(Product product){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("lesson13CollectionsFiles/Products.txt", true))){
            writer.write(String.format("\n%d   %10s%10d%10s", product.getId(), product.getName(),product.getPrice(),product.getType().getName()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*private static void editAddedObject(Product product){
        try(BufferedReader reader = new BufferedReader(new FileReader("lesson13CollectionsFiles/Products.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("lesson13CollectionsFiles/Products.txt", false)))
        {
            ArrayList<String> lines = new ArrayList<>();
            Iterator<String> iterator = lines.iterator();
            while(iterator.hasNext()){
                lines.add(iterator.next());
            }
            for (String s: lines){
                if(s.startsWith(String.valueOf(product.getId()))){
                    writer.write(String.format("\n%d   %10s%10d%10s", product.getId(), product.getName(),product.getPrice(),product.getType().getName()));
                } else {
                    writer.write(s);
                }
            }
            writer.write(String.format("\n%d   %10s%10d%10s", product.getId(), product.getName(), product.getPrice(), product.getType().getName()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}
