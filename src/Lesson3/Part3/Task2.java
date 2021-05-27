package Lesson3.Part3;

import java.util.Random;
import java.util.Scanner;

/*2)Вывести нечетные элементы находящиеся под главной
        диагональю(включительно).*/
public class Task2 {
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
            for (int j = 0; j <= i; j++) {
                if(array[i][j] % 2 != 0){
                    sum += array[i][j];
                    System.out.printf("%d ", array[i][j]);;
                }
            }
        }
        System.out.println("\nSum: " + sum);
    }
}
