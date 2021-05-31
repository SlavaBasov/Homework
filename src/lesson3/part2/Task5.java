package lesson3.part2;
/*5) «Сожмите» массив, выбросив из него каждый второй элемент.
        «Освободившиеся» места массива заполните нулями.*/
public class Task5 {
    public static void main(String[] args) {
        int[] array;
        StartOfTask startOfTask = new StartOfTask();
        array = startOfTask.start();

        for (int i = 0; i < array.length; i++) {
            if(i % 2 != 0){
                array[i] = 0;
            }
        }
        System.out.print("Полученный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
