package lesson1;
/*1) В переменную записываем число. Надо вывести на экран сколько в этом
        числе цифр и положительное оно или отрицательное. Например, "это
        однозначное положительное число". Достаточно будет определить, является ли
        число однозначным, "двухзначным или трехзначным и более.*/

public class Task_1 {
    public static void main(String[] args) {
        int num = 0;
        if (num != 0) {
            if (num / 10 != 0) {
                if (num / 100 != 0) {
                    if (num / 1000 != 0) {
                        System.out.print("Перебор! ");
                    } else {
                        System.out.print("Это трехзначное ");
                    }
                } else {
                    System.out.print("Это двузначное ");
                }
            } else {
                System.out.print("Это однозначное ");
            }

            if (num > 0 && num < 1000) {
                System.out.println("положительное число.");
            } else if (num < 0 && num > -1000) {
                System.out.println("отрицательное число.");
            } else {
                System.out.println("Введите число, содержащее 3 и менее знаков.");
            }
        } else {
            System.out.println("Это ноль.");
        }


    }
}
