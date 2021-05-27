package Lesson2;
/*4)Составьте программу, вычисляющую A*B, не пользуясь операцией
        умножения.*/
public class Task_4 {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        int sum = 0;

        for (int i = 0; i < b; i++) {
            sum += a;
        }
        System.out.println("Произведение: " + sum);
    }
}
