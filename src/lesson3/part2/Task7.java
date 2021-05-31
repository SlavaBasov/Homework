package lesson3.part2;
/*7) Подсчитать, сколько раз встречается элемент с заданным значением.*/

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int[] array;
        StartOfTask startOfTask = new StartOfTask();
        array = startOfTask.start();
        Scanner scanner = new Scanner(System.in);
        int num;
        int count = 0;

        while (true){
            System.out.print("Введите число, с которым будет происходить сравнение: ");
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
            if(i == num){
                count++;
            }
        }
        System.out.printf("Заданное число %d встречается %d раз", num, count);

    }
}
