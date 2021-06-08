package lesson5_8_OOP.tasksInWord.task8;

public class User {
    private String login;
    private String password;
    private Basket basket;

    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public void setBasket(Product... products){
        basket = new Basket(products);
    }

    public void printBasketInfo(){
        System.out.printf("У покупателя %s в корзине: ", login);
        for (Product p: basket.getProducts()){
            System.out.print(p.getName() + " ");
        }
        System.out.println();
    }

    public void printPriseInfo(){
        double sum = 0;
        for (Product p: basket.getProducts()){
            sum += p.getPrise();
        }
        System.out.printf("Стоимость покупок в корзине: %5.2f рублей\n", sum);
    }

    public void printInfo(){
        printBasketInfo();
        printPriseInfo();
    }
}
