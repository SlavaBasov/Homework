package Lesson_3.Part_1;
/*4)Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
массив на экран в строку. Замените каждый элемент с нечётным индексом на
ноль. Снова выведете массив на экран на отдельной строке.*/

import java.util.Random;

public class Task_4 {
    public static void main(String[] args) {
        int[] nums = new int[20];
        Random random = new Random();
        for(int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(21);
        }
        System.out.print("Полученный массив: ");
        for (int i: nums){
            System.out.print(i + " ");
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 != 0){
                nums[i] = 0;
            }
        }
        System.out.print("\nИзмененный массив: ");
        for (int i: nums){
            System.out.print(i + " ");
        }
    }
}
