package lesson3.part1;
/*9)Пользователь должен указать с клавиатуры положительное число, а
        программа должна создать массив указанного размера из случайных целых
        чисел из [0;15] и вывести его на экран в строку. После этого программа должна
        определить и сообщить пользователю о том, сумма какой половины массива
        больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
        пользователь введёт неподходящее число, то выдать соответствующее
        сообщение*/

import java.util.Random;
import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);
        int[] arr;
        Random random = new Random();
        int sum1 = 0;
        int sum2 = 0;

        System.out.print("Введите размер массива: ");
        if(!sc.hasNextInt()){
            System.out.println("Вы ввели не число, попробуйте еще раз.");
        }else {
            input = sc.nextInt();
            sc.close();
            if(input < 0 || input == 0){
                System.out.println("Введите число больше 0");
            } else {
                arr = new int[input];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = random.nextInt(16);
                    if (i < arr.length / 2){
                        sum1 += arr[i];
                    } else if(i > arr.length / 2){
                        sum2 += arr[i];
                    }
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                if(sum1 > sum2){
                    System.out.printf("Сумма первого модуля больше суммы второго: %d > %d", sum1, sum2);
                } else if(sum1 < sum2){
                    System.out.printf("Сумма первого модуля меньше суммы второго: %d < %d", sum1, sum2);
                } else {
                    System.out.printf("Суммы первого и второго модуля равны: %d = %d", sum1, sum2);
                }
            }
        }

    }
}
