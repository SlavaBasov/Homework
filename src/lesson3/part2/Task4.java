package lesson3.part2;
/*4) Найти наименьший нечетный элемент.*/

public class Task4 {
    public static void main(String[] args){
        int[] array;
        StartOfTask startOfTask = new StartOfTask();
        array = startOfTask.start();
        int minElement = 0;
        boolean check = false;


        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0){
                if(!check){
                    minElement = array[i];
                    check = true;
                }
                if(array[i] < minElement){
                    minElement = array[i];
                }
            }
        }
        if (!check){
            System.out.println("Нет таких значений");
        }else {
            System.out.println("Наименьший нечетный элемент: " + minElement);
        }

    }
}
