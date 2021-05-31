package lesson3.part2;

import java.util.Random;
import java.util.Scanner;

public class StartOfTask {
        int[] array = new int[0];
        int arraySize;
        int minNum = 0;
        int maxNum = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        public int[] start() {
            while (true) {
                System.out.print("Введите размер массива: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Вы ввели не число... ");
                    scanner.next();
                } else {
                    arraySize = scanner.nextInt();
                    if (arraySize < 1 || arraySize > 2147483647) {
                        continue;
                    } else {
                        array = new int[arraySize];
                        System.out.print("Введите минимальное вероятное значение в массиве: ");
                        if (!scanner.hasNextInt()) {
                            System.out.println("Вы ввели не число... ");
                            scanner.next();
                        } else {
                            minNum = scanner.nextInt();
                            System.out.print("Введите максимальное вероятное значение в массиве: ");
                            if (!scanner.hasNextInt()) {
                                System.out.println("Вы ввели не число... ");
                                scanner.next();
                            } else {
                                maxNum = scanner.nextInt();
                             //   scanner.close();
                                break;
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(maxNum - minNum + 1) + minNum;
            }

            System.out.print("Создание массива...\nПодбор значений...\nПолученный массив: ");
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
            return array;
        }
}
