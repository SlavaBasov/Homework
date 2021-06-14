package lesson5_8_OOP.lesson8.task3;

public class Application {
    public static void main(String[] args) {
        Seasons[] seasons = Seasons.values();

        for (Seasons s: seasons){
            s.print();
            Seasons.printFavorite(s);
            System.out.println();
        }


    }




}
