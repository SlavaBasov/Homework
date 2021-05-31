package lesson2;
//вывести таблицу умножения

public class MultipleTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 10; j++){
               System.out.printf("%3d ", j * i);
            }
            System.out.println();
        }

    }
}
