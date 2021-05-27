package Lesson3.Part1;
/*3)Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
        массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
        это количество на экран на отдельной строке.*/

import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        int[] nums = new int[15];
        Random random = new Random();
        for(int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(100);
        }
        System.out.print("Полученный массив: ");
        for (int i: nums){
            System.out.print(i + " ");
        }

        int count = 0;
        for(int i: nums){
            if(i % 2 == 0){
                count++;
            }
        }
        System.out.println("\nЧетных чисел в массиве: " + count);
    }
}
