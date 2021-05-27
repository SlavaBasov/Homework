package Lesson2;
//нарисовать в консоли песочные часы

public class Sendglass {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int n = 0; n < 5 - i * 2; n++) {
                System.out.print("*");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print(" ");
            }
            for (int n = 0; n < 5 - i * 2; n++) {
                System.out.print("*");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
