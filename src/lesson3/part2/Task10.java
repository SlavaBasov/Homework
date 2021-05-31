package lesson3.part2;

public class Task10 {
    public static void main(String[] args) {
        int[] array;
        StartOfTask startOfTask = new StartOfTask();
        array = startOfTask.start();

        int max = array[0];
        int index = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
                index = i;
            }
        }
        array[index] = array[0];
        array[0] = max;
        System.out.printf("Максимальный элемент: %d\nПолученный массив: ", max);
        for (int i: array){
            System.out.print(i + " ");
        }

    }
}
