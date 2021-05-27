package Lesson3.Part1;
/*8)Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
        массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
        массива должен равняться отношению элемента из первого массива с i-ым
        индексом к элементу из второго массива с i-ым индексом. Вывести все три
        массива на экран (каждый на отдельной строке), затем вывести количество
        целых элементов в третьем массиве.*/

import java.util.Random;

public class Task_8 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        double[] arr3 = new double[10];
        Random random = new Random();
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(10);
            arr2[i] = random.nextInt(10);
            if(arr2[i] != 0) {
                arr3[i] = ((double) arr1[i]) / arr2[i];
            } else {
                arr3[i] = -1;
            }
            if(arr3[i] % 1 == 0  && arr3[i] >= 0){
                count++;
            }
        }
        System.out.print("Первый массив: ");
        for (int i: arr1){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Второй массив: ");
        for (int i: arr2){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Третий массив: ");
        for (double i: arr3){
            System.out.print(i + " ");
        }
        System.out.println("\nЦелых чисел в третьем массиве: " + count);
    }
}
