package lesson5_8_OOP.lesson8.task1;

public class Application {
    public static void main(String[] args) {
        Printable book1 = new Book("Книга 1");
        Printable book2 = new Book("Книга 2");
        Printable magazine1 = new Magazine("Журнал 1");
        Printable magazine2 = new Magazine("Журнал 2");
        Printable[] printable = {book1, book2, magazine1, magazine2};
        for(Printable p: printable){
            p.print();
        }
    }
}
