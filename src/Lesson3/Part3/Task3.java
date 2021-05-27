package Lesson3.Part3;
/*3)Проверить произведение элементов какой диагонали больше.*/
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[][] array;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size;
        int multiply1 = 1;
        int multiply2 = 1;

        System.out.print("Enter size: ");
        size = scanner.nextInt();
        array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(4);
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
            multiply1 *= array[i][i];
        }
        System.out.print("Multiply1: " + multiply1 + "   ");
        for (int i = 0; i < array.length; i++) {
            multiply2 *= array[i][array.length - 1 - i];
        }
        System.out.println("Multiply2: " + multiply2);

        if(multiply1 > multiply2){
            System.out.printf("Multiply of main diagonal is more than side diagonal: %d > %d", multiply1, multiply2);
        } else if(multiply1 < multiply2){
            System.out.printf("Multiply of side diagonal is more than main diagonal: %d < %d", multiply1, multiply2);
        } else {
            System.out.printf("Multiply of main diagonal and side diagonal are equal: %d = %d", multiply1, multiply2);
        }
    }
}
