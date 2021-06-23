package lesson11.task2.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFormater {
    public static String[] getSentencesArray(String fileName){
        String[] lines = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            StringBuilder builder = new StringBuilder();
            String line;
            while ((line = reader.readLine())!=null){
                builder.append(line);
            }
            lines = builder.toString().split("\\s*[!?.]\\s*");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;

    }

    public static int getNumOfWords(String line){
        String[] lines = line.split("\\s+");
        return lines.length;
    }

    public static boolean containsPalindrome(String line){
        String[] lines = line.split("\\s+");
        boolean result = false;
        for (String s: lines){
            if (s.equalsIgnoreCase(new StringBuilder(s).reverse().toString()) && s.toCharArray().length > 1){
                result = true;
                break;
            }
        }
        return result;
    }
}
