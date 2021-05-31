package lesson3.part2;
/*9) Найти наименьший элемент среди элементов с четными индексами массива*/

public class Task9 {
    public static void main(String[] args) {
        int[] array;
        StartOfTask startOfTask = new StartOfTask();
        array = startOfTask.start();
        int min = array[0];

        for (int i = 2, count = 0; i < array.length; i += 2) {
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Наименьший элемент среди элементов с четными индексами: " + min);

    }
}
