package lesson1;
/*4) Даны 3 целых числа. Найти количество положительных чисел в исходном
        наборе.*/
public class Task_4 {
    public static void main(String[] args) {
        int num1 = -1;
        int num2 = -4;
        int num3 = -12;
        int result = 0;

        if(num1 > 0) { result++;}
        if(num2 > 0) { result++;}
        if(num3 > 0) { result++;}

        System.out.printf("Среди заданных чисел %d положительных.", result);
    }
}
