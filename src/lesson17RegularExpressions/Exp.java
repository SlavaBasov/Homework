package lesson17RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//ip формата 255.255.255.16
public class Exp {
    public static void main(String[] args) {
            String regex = "(^((\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])\\.){3}(\\d|1[0-6])$)";
            String input = "121.121.121.5";

            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(input);
            while (m.find()){
                System.out.printf("Найдено - %s  Старт - %d, конец - %d\n", m.group(), m.start(), m.end()-1);
            }

    }
}
