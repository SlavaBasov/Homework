package lesson4_5.tasksInWord.task3;

public class Program {
    public static void main(String[] args) {
        Reader reader = new Reader("Петров", 515616, "Юридический",
                "05.12.1995", "+375295533545");
        reader.takeBook(3);
        reader.takeBook("Том сойер", "Крутая книга", "Прочитай меня");
        Book book = new Book("Руслан Батырканбеков", "1000 и 1 способ выучить русский язык");
        Book book1 = new Book("Камзар Кантышаедов", "Учись иди сдохни");
        Book book2 = new Book("Бомж Петрович", "Js для про");
        reader.takeBook(book, book1, book2);
        reader.returnBook(3);
        reader.returnBook("Том сойер", "Крутая книга", "Прочитай меня");
        reader.returnBook(book, book1, book2);

    }
}
