package lesson1;
/*3) Дано целое число. Если оно является положительным, то прибавить к нему 1.
        Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
        10. Вывести полученное число.*/

public class Task_3 {
    public static void main(String[] args) {
        int i = 0;
        if(i > 0){
            i++;
        } else if(i < 0){
            i -= 2;
        } else {
            i = 10;
        }
        System.out.printf("Результат: %d\n", i);

    }
}
