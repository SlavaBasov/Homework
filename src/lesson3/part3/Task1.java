package lesson3.part3;
/*Начало всех задач:
        Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
        случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
        матрицы).
        1) Почитать сумму четных элементов стоящих на главной диагонали.*/

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[][] array;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size;
        int sum = 0;

        System.out.print("Enter size: ");
        size = scanner.nextInt();
        array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(51);
            }
        }
        System.out.println("Received array: ");
        for(int[] i: array){
            for(int j: i){
                System.out.printf("%3d",j);
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i == j && array[i][j] % 2 == 0){
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Sum: " + sum);

    }
}
