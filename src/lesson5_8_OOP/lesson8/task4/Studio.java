package lesson5_8_OOP.lesson8.task4;

public class Studio{

    public void dressMen(Clothes[] clothes) {
        System.out.println("Man's clothes:");
        for (Clothes c: clothes){
            if(c instanceof ManClothes){
                System.out.println(c);
            }
        }
    }

    public void dressWoman(Clothes[] clothes) {
        System.out.println("Woman's clothes:");
        for (Clothes c: clothes){
            if(c instanceof WomanClothes){
                System.out.println(c);
            }
        }
    }
}
