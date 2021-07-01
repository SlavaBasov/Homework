package lesson12_GenericsCollections.onLesson;

import java.util.Arrays;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        List<String> temp = Arrays.asList("T1", "T2", "T3");
        temp.hashCode();
        String a = "dqwdqd";
        System.out.println(temp.hashCode());
        System.out.println(a.hashCode());
    }
}
