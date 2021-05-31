package lesson3.part2;

public class Task8 {
    public static void main(String[] args) {
        int[] array;
        StartOfTask startOfTask = new StartOfTask();
        array = startOfTask.start();
        int max = 0;
        int max2 = 0;


        for(int i = 0, count = 0; i < array.length; i++){
            if(count == 0){
                max = array[i];
                max2 = array[i];
                count++;
            }
            else if(array[i] > max){
                max = array[i];
            }
        }
        for(int i = 0, count = 0; i < array.length; i++){
            if(count == 0 && array[i] != max){
                max2 = array[i];
                count++;
            }
            else if(array[i] > max2 && array[i] != max){
                max2 = array[i];
            }
        }

        System.out.println("Максималькое число в массиве: " + max);
        System.out.println("Второе максималькое число в массиве: " + max2);

    }
}
