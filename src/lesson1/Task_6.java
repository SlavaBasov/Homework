package lesson1;
/*6) Даны 2 числа. Вывести большее из них.*/

public class Task_6 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 6;

        if(num1 > num2){
            System.out.println("Большее число: " + num1);
        }else if(num1 < num2){
            System.out.println("Большее число: " + num2);
        } else {
            System.out.println("Оба числа равны");
        }

    }
}
