package Lesson2;
//3)Вычислить: 1+2+4+8+...+256
public class Task_3 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 1;
        int count = 0;

        while (i < 256){
            count++;
            i *= 2;
            sum += i;
            System.out.printf("В %d раз прибавляем %d, сумма равна: %d\n", count, i, sum);

        }
        System.out.println("Сумма равна: " + sum);
    }
}
