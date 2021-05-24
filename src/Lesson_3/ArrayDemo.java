package Lesson_3;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        /*int[] arr1 = new int[10];
        int[] arr2 = {1, 2, 5, -1, 4};*//*
        String[] arr3 = {"A", "B", "C"};
        System.out.println(arr3.length);
        String element = arr3[1];
        System.out.println(element);*/

        int[] numbers = {10,5,6,3,7,9,6,1};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        Arrays.sort(numbers);
        System.out.print("\nОтсортированный массив: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        for(int a: numbers){
            System.out.print(a + " ");
        }


    }
}
