package lesson5_8_OOP.lesson8.task1;

public class Magazine implements Printable{
    private String name;
    private String typeOfPaper;

    public Magazine() {
    }

    public Magazine(String name) {
        this.name = name;
    }

    public Magazine(String name, String typeOfPaper) {
        this.name = name;
        this.typeOfPaper = typeOfPaper;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfPaper() {
        return typeOfPaper;
    }

    public void setTypeOfPaper(String typeOfPaper) {
        this.typeOfPaper = typeOfPaper;
    }

    @Override
    public void print() {
        printName();
    }

    @Override
    public void printName() {
        System.out.println(name);
    }


    public static void printMagazines(Printable[] printable){
        for (Printable p: printable){
            if(p instanceof Magazine){
                p.printName();
            }
        }
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                ", typeOfPaper='" + typeOfPaper + '\'' +
                '}';
    }
}
