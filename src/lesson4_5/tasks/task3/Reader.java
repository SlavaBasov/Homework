package lesson4_5.tasks.task3;

public class Reader {
    private String name;
    private int numberCard;
    private String faculty;
    private String birthDay;
    private String telephoneNumber;

    public Reader(){
    }

    public Reader(String name, int numberCard, String faculty, String birthDay, String telephoneNumber) {
        this.name = name;
        this.numberCard = numberCard;
        this.faculty = faculty;
        this.birthDay = birthDay;
        this.telephoneNumber = telephoneNumber;
    }

    public void takeBook(int num){
        System.out.printf("%s взял %d книг\n", name, num);
    }
    public void takeBook(String... titles){
        System.out.printf("%s взял книги: ", name);
        for(String s: titles){
            System.out.print(s + ", ");
        }
        System.out.println();
    }
    public void returnBook(Book... books){
        System.out.printf("%s взял книги: ", name);
        for(Book s: books){
            System.out.print(s.getTitle() + ", ");
        }
        System.out.println();
    }

    public void returnBook(int num){
        System.out.printf("%s вернул %d книг\n", name, num);
    }
    public void returnBook(String... titles){
        System.out.printf("%s вернул книги: ", name);
        for(String s: titles){
            System.out.print(s + ", ");
        }
        System.out.println();
    }
    public void takeBook(Book... books){
        System.out.printf("%s вернул книги: ", name);
        for(Book s: books){
            System.out.print(s.getTitle() + ", ");
        }
        System.out.println();
    }



}
