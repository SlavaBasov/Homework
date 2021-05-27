package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type number: ");
        int a = scanner.nextInt();
        Random random = new Random();


        while (a > 0){
            int b = random.nextInt(9);
            System.out.println(b);
            a--;
        }
    }
}
