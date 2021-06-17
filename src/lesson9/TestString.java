package lesson9;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class TestString {
    public static void main(String[] args) {
        String line = "Java is very cool language";
        /*String line2 = "Java is very cool language";
        String line3 = new String("Java is very cool language");
        String line4 = "Java is very";
        String line5 = " cool language";
        String line6 = line4 + line5;
        String line7 = "Java is very" + line5;
        System.out.println("line = line2: " + (line == line2));
        System.out.println("line = line3: " + (line == line3));
        System.out.println("line = line6: " + (line == line6));
        System.out.println("line = line7: " + (line == line7));
        System.out.println("line6 = line7: " + (line6 == line7));
        System.out.println("line6 = line7: " + (line6 == line7));*/

        System.out.println("get bytes: " + line.getBytes(StandardCharsets.UTF_8));
        System.out.println(line.toLowerCase());
        System.out.println(line.toUpperCase());
        char[] array = line.toCharArray();
        System.out.println(array);
        System.out.println(line.charAt(0));
        String s1 = "Java";
        System.out.println(s1.concat(" cool"));
        String[] lineMod1 = line.split(" ");
        System.out.println(lineMod1[0]);
        for (String s: lineMod1){
            System.out.print(s);
        }
        System.out.println();
        String[] lineMod2 = line.split(" ", 3);
        for (String s: lineMod2){
            System.out.print(s);
        }
        System.out.println();
        System.out.println(lineMod2.length);
        System.out.println(line.substring(0,5));
        System.out.println(line.codePointAt(1));
        System.out.println(line.subSequence(0,4));
        System.out.println(line.compareTo("Java is very cool language"));
        System.out.println(line.compareToIgnoreCase("JAVA is very cool languagejoijio"));
        String lineOne = "S";
        System.out.println(lineOne.compareTo("s"));
        System.out.println(lineOne.compareToIgnoreCase("s"));
        System.out.println(lineOne.equals("s"));
        System.out.println(lineOne.equalsIgnoreCase("s"));
        System.out.println(line.contains("cool"));
        System.out.println(line.isEmpty());
        System.out.println("".isEmpty());
        System.out.println("   ".isEmpty());
        System.out.println(line.matches("(.*)Java(.*)"));
        System.out.println(line.regionMatches(1, "Java", 1, 3));
        System.out.println(line.regionMatches(1, "Java", 1, 3));
        System.out.println(line.startsWith("va is", 2));
        System.out.println(line.replace("cool", "bad"));
        System.out.println("hey hey hey".replace("hey", "nope"));
        System.out.println("hey hey hey".indexOf('y'));
        System.out.println("hey hey hey".lastIndexOf("hey"));








    }
}
