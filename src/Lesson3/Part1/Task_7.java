package Lesson3.Part1;

import java.util.Random;

/*7)Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
        какой элемент является в этом массиве максимальным и сообщите индекс его
        последнего вхождения в массив.*/
public class Task_7 {
    public static void main(String[] args) {
        int[] arr = new int[12];
        Random random = new Random();
        int max = -1;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(16);
        }
        System.out.print("Массив: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max || arr[i] == max) {
                max = arr[i];
                index = i;
            }
        }
        if (max == -1 || index == -1) {
            System.out.println("Error!");
        } else {
            System.out.printf("Максимальный элемент: %d     Индекс: %d\n", max, index);
        }

    }
}
