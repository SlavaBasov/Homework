package lesson3.part2;

import java.util.Scanner;

/*3) Найти средне арифметическое элементов массива, превосходящих некоторое
        число С.*/
public class Task3 {
    public static void main(String[] args) {
        int[] array;
        StartOfTask startOfTask = new StartOfTask();
        array = startOfTask.start();
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;
        int count = 0;

        while (true){
            System.out.print("Введите превосходящее число: ");
            if(!scanner.hasNextInt()){
                System.out.println("Вы ввели не число... ");
                scanner.next();
            } else {
                num = scanner.nextInt();
                scanner.close();
                break;
            }
        }
        for (int i: array){
            if(i > num){
                sum += i;
                count++;
            }
        }
        System.out.printf("Среднее арифметическое всех элементов превосхлдящих %d: %f", num, (double)sum / count);




    }
}
