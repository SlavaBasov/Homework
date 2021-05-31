package lesson3.part3;
/*5)Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
        строкой и т. д.)*/
import java.util.Random;
import java.util.Scanner;

public class Task5 {
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

        int[][] array2 = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array2[j][i] = array[i][j];
            }
        }
        System.out.println("Received new array: ");
        for(int[] i: array2){
            for(int j: i){
                System.out.printf("%3d",j);
            }
            System.out.println();
        }
    }
}
