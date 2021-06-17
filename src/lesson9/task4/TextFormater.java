package lesson9.task4;

public class TextFormater {
    public static int numOfWordsInString(String line){
        String[] s = line.split("\\s+");
        return s.length;
    }
}
