package Lesson_3.Part_1;

import java.util.Random;
import java.util.Scanner;

/*10)Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
        переменную n. Если пользователь ввёл не подходящее число, то программа
        должна выдать соответствующее сообщение. Создать массив из n случайных
        целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
        только из чётных элементов первого массива, если они там есть, и вывести его
        на экран.*/

public class Task_10 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        int[] arr1;
        int[] arr2;
        int count = 0;
        Random random = new Random();


        System.out.print("Введите размер массива (число должно быть больше 3): ");
        if(!sc.hasNextInt()){
            System.out.println("Вы ввели не число, попробуйте еще раз.");
        }else {
            n = sc.nextInt();
            sc.close();
            if(n < 4){
                System.out.println("Введите число больше 3");
            } else {
                arr1 = new int[n];
                for (int i = 0; i < arr1.length; i++) {
                    arr1[i] = random.nextInt(n + 1);
                    if(arr1[i] % 2 == 0){
                        count++;
                    }
                }

                System.out.print("Первый массив: ");
                for (int i: arr1){
                    System.out.print(i + " ");
                }
                System.out.println();

                if(count == 0){
                    System.out.println("В первом массиве нет четных чисел");
                } else {
                    arr2 = new int[count];
                    count = 0;
                    for (int i = 0; i < arr1.length; i++) {
                        if (arr1[i] % 2 == 0) {
                            arr2[count++] = arr1[i];
                        }
                    }
                    System.out.print("Второй массив: ");
                    for (int i : arr2) {
                        System.out.print(i + " ");
                    }
                }
            }
        }

    }
}
