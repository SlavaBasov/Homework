package Lesson_2;
/*2)Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
        сколько амеб будет через 3, 6, 9, 12,..., 24 часа.*/

public class Task_2 {
    public static void main(String[] args) {
        int ameb = 1;
        int hours = 3;
        int pers = 2;
        int totalAmeb = ameb;

        for (int i = 1; i <= 24; i++) {
            if(i % hours == 0){
                totalAmeb *= 2;
                System.out.printf("Через %d часов стало %d\n",i , totalAmeb);

            }

        }
    }
}
