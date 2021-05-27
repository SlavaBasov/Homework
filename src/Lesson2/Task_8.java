package Lesson2;
/*И ещё можете попрактиковаться и нарисовать оставшиеся 2
        треугольника
            *
          * *      (1)
        * * *
      * * * *

      * * * *
        * * *      (2)
          * *
            *                */

public class Task_8 {
    public static void main(String[] args) {
        int count = 4;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if(j < count) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            count--;
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if(j > count) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            count++;
            System.out.println();
        }
    }
}
