package Lesson3.Part2;
/*6) Проверить, различны ли все элементы массива.*/
public class Task6 {
    public static void main(String[] args) {
        int[] array;
        StartOfTask startOfTask = new StartOfTask();
        array = startOfTask.start();
        int num = 0;
        int check = 0;

        for (int i = 0, count = 0; i < array.length; i++) {
            count = 0;
            for (int j = 1; j < array.length; j++) {
                if(array[i] == array[j] && i != j){
                    check = 1;
                    count++;
                }
            }
            if(count == array.length - 1){
                check = 2;
            }
        }
        switch (check){
            case 1:
                System.out.println("В массиве есть одинаковые элементы.");
                break;
            case 2:
                System.out.println("Все элементы массива равны.");
                break;
            default:
                System.out.println("В массиве все элементы различны.");
                break;
        }

    }
}
