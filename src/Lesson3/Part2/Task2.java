package Lesson3.Part2;
/*2) Найти среднее арифметическое элементов с нечетными номерами.*/
public class Task2 {
    public static void main(String[] args) {
        int[] array;
        StartOfTask startOfTask = new StartOfTask();
        array = startOfTask.start();
        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if(i % 2 != 0){
                sum += array[i];
                count++;
            }
        }
        System.out.println("Среднее арифметическое всех нечетных элементов массива: " + (double)sum / count);



    }
}
