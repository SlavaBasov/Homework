package lesson9;
/*1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
        последнего вхождения сивола(B).*/
public class Task1 {
    public static void main(String[] args) {
        String line = "Java is very cool language";
        System.out.println(line.substring(line.indexOf("v"), line.lastIndexOf("l")));
    }
}
