package lesson3;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int a = scanner.nextInt();
        String str = scanner.nextLine();

        System.out.println(a);
        System.out.println(str);
    }
}
