package lesson1;
/*5) Даны 3 целых числа. Найти количество положительных и отрицательных
        чисел в исходном наборе.*/

public class Task_5 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 4;
        int num3 = -12;
        int resultPos = 0;
        int resultNeg = 0;

        if(num1 > 0) { resultPos++;} else { resultNeg++;}
        if(num2 > 0) { resultPos++;} else { resultNeg++;}
        if(num3 > 0) { resultPos++;} else { resultNeg++;}

        System.out.printf("Среди заданных чисел:\n%d положительных\n%d отрицательных", resultPos, resultNeg);
    }
}
