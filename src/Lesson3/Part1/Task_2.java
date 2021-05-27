package Lesson3.Part1;
/*2)Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
        строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
        порядке (99 97 95 93 … 7 5 3 1).*/

public class Task_2 {
    public static void main(String[] args) {
        int min = 1;
        int max = 99;
        int[] nums;
        if(max % 2 != 0) {
            nums = new int[max / 2 + 1];
        } else {
            nums = new int[max / 2];
        }

        for(int i = 0, count = 0; i <= max && count < nums.length; i++){
            if(i % 2 != 0){
                nums[count] = i;
                count++;
            }
        }
        for(int i: nums){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = nums.length - 1; i >= 0; i--){
            System.out.print(nums[i] + " ");
        }
    }
}
