package lesson3.part2;
/*1) Найти произведение элементов, кратных 3.*/

public class Task1{
    public static void main(String[] args) {
        int[] array;
        StartOfTask startOfTask = new StartOfTask();
        array = startOfTask.start();
        int multiply = 0;
        boolean check = false;
        System.out.print("Кратные 3-м числа в массиве: ");
        for(int i: array){
            if(i % 3 == 0){
                System.out.print(i + " ");
                if(!check){
                    multiply = i;
                    check = true;
                } else {
                    multiply *= i;
                }
            }
        }
        if(!check){
            System.out.println("нет\nВ массиве нет чисел кратных трем.");
        } else {
            System.out.print("\nПроизведение всех чисел кратных 3 равно: " + multiply);
        }
    }
}
