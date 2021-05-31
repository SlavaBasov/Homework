package lesson3.part1;
/*5)Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
        выведите массивы на экран в двух отдельных строках. Посчитайте среднее
        арифметическое элементов каждого массива и сообщите, для какого из
        массивов это значение оказалось больше (либо сообщите, что их средние
        арифметические равны).*/

import java.util.Random;

public class Task_5 {
    public static void main(String[] args) {
        int[] nums1 = new int[5];
        int[] nums2 = new int[5];
        double sumNums1 = 0;
        double sumNums2 = 0;
        double middle1;
        double middle2;

        Random random = new Random();
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = random.nextInt(16);
            nums2[i] = random.nextInt(16);
        }
        System.out.print("Первый массив: ");
        for(int i: nums1){
            System.out.print(i + " ");
            sumNums1 += i;
        }
        System.out.println();
        System.out.print("Второй массив: ");
        for(int i: nums2){
            System.out.print(i + " ");
            sumNums2 += i;
        }
        System.out.println();
        middle1 = sumNums1 / nums1.length;
        middle2 = sumNums2 / nums2.length;

        System.out.println("Среднее арифметическое значение 1 массива: " + middle1);
        System.out.println("Среднее арифметическое значение 2 массива: " + middle2);

        if(middle1 > middle2){
            System.out.println("Среднее арифметическое значение первого массива больше чем второго");
        } else if(middle1 < middle2){
            System.out.println("Среднее арифметическое значение второго массива больше чем первого");
        } else {
            System.out.println("Средние арифметические значения первого и второго массива равны");
        }

    }
}
