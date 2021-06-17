package lesson9;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder line = new StringBuilder("JavaTop");
        System.out.println(line.append("Language"));
        System.out.println(line);
        System.out.println(line.delete(4,7));
        System.out.println(line.indexOf("Lan"));
        int i = line.length();
        System.out.println(line.replace(4, line.length(), "Top"));
        System.out.println(line.capacity());
        line.reverse();
        System.out.println(line);
        line.reverse();

    }
}
