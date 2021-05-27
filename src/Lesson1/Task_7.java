package Lesson1;
/*7) (Дополнительно) В переменную записываете количество программистов. В
        зависимости от количества программистов необходимо вывести правильно
        окончание. Например:
        • 2 программиста
        • 1 программиста
        • 10 программистов
        • и т.д.*/

public class Task_7 {
    public static void main(String[] args) {
        int num = 12;
        String ending;
        int numChanged = num % 10;

        if(num < 0) {
            System.out.println("Не может быть колличество программистов меньше 0.");
        } else {

            if (numChanged == 1) {
                ending = "";
            } else if (numChanged == 2 || numChanged == 3 || numChanged == 4) {
                ending = "а";
            } else {
                ending = "ов";
            }

            System.out.printf("%d программист%s", num, ending);
        }
    }
}
