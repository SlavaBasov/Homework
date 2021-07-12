package lesson17RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exp {
    public static void main(String[] args) {
            String regex = "^([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$";
            String input = "269";

            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(input);
            System.out.println(m.find());
    }
}
