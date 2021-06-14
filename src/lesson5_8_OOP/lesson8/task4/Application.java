package lesson5_8_OOP.lesson8.task4;

public class Application {
    public static void main(String[] args) {
        Clothes pants = new Pants(Sizes.L, 4.5, "black");
        Clothes skirt = new Skirt(Sizes.S, 4, "yellow");
        Clothes teeShirt = new TeeShirt(Sizes.M, 3, "gray");
        Clothes tie = new Tie(Sizes.M, 2, "black");

        Clothes[] clothes = {pants, skirt, teeShirt, tie};

        Studio studio = new Studio();
        studio.dressMen(clothes);
        System.out.println();
        studio.dressWoman(clothes);
    }
}
