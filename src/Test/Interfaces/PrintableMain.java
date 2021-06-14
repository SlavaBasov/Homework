package Test.Interfaces;

import java.security.spec.RSAOtherPrimeInfo;

public class PrintableMain {
    public static void main(String[] args) {
        Book book = new Book("Война и мир", 4465);
        Journal journal = new Journal("Один дома", "A5");
        Printable[] printables = {book, journal};

        for (Printable p: printables){
            p.print();
        }
        System.out.println(((Book)book).getTitle() + " qwdqwdqd");

        Printable book1 = new Book("Война и мир", 4465);
        Journal journal1 = new Journal("Один дома", "A5");
        Printable[] printables1 = {book1, journal1};

        ((Printable)book).print();
    }
}
