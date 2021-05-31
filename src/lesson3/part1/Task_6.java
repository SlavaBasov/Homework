package lesson3.part1;

import java.util.Random;

/*6)Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
        на экран в строку. Определить и вывести на экран сообщение о том, является ли
        массив строго возрастающей последовательностью.*/
public class Task_6 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Random random = new Random();
        boolean check = true;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(11);
        }
        System.out.print("Массив: ");
        for (int i: arr) {
            System.out.print(i + " ");
        }
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i - 1] || arr[i] == arr[i - 1]){
                check = false;
            }
        }

        if (check){
            System.out.println("\nМассив является строго возрастающей последовательностью");
        } else {
            System.out.println("\nМассив не является строго возрастающей последовательностью");
        }
    }
}
