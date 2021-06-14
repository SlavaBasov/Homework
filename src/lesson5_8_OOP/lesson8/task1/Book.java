package lesson5_8_OOP.lesson8.task1;

public class Book implements Printable{
    private String name;
    private String numOfPages;

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, String numOfPages) {
        this.name = name;
        this.numOfPages = numOfPages;
    }

    @Override
    public void print() {
        printName();
    }

    @Override
    public void printName() {
        System.out.println(name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(String numOfPages) {
        this.numOfPages = numOfPages;
    }

    public static void printMagazines(Printable[] printable){
        for (Printable p: printable){
            if(p instanceof Book){
                p.printName();
            }
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", numOfPages='" + numOfPages + '\'' +
                '}';
    }
}
