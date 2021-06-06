package lesson4_5.tasksInWord.task8;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product("Рис", 2.1, 4);
        Product product2 = new Product("Гречка", 2.5, 5);
        Product product3 = new Product("Макароны", 1.5, 3.5);
        Product product4 = new Product("Пепси", 1.8, 4.2);
        Product product5 = new Product("Дарида", 1.3, 4);
        Product product6 = new Product("Сок", 2, 4.5);
        Product product7 = new Product("Говядина", 8.5, 4);
        Product product8 = new Product("Свинина", 9, 4.5);
        Product product9 = new Product("Курица", 6.5, 4.2);

        Category category1 = new Category("Крупы", product1, product2, product3);
        Category category2 = new Category("Напитки", product4, product5, product6);
        Category category3 = new Category("Мясо", product7, product8, product9);

        User user1 = new User("User1", "12345");
        user1.setBasket(product8, product2, product4);
        user1.printInfo();

    }
}
