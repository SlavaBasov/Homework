package Lesson3.Part1;
/*1)Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
        массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
        затем в столбик (отделяя один элемент от другого началом новой строки). Перед
        созданием массива подумайте, какого он будет размера.*/

public class Task_1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int end = 20;
        for (int i = 2, count = 0; i <= end && count < arr.length; i++) {
            if(i % 2 == 0){
                arr[count] = i;
                count++;
            }
        }
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i: arr){
            System.out.println(i);
        }
    }
}
