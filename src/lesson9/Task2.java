package lesson9;
/*2) Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в
        позиции 0*/
public class Task2 {
    public static void main(String[] args) {
        String line = "Java is very cool language";
        System.out.println(line.replace(line.charAt(3), line.charAt(0)));
    }
}
