package lesson11.task1.service;

import java.io.*;

public class FileHandler {

    public static String[] readFile(String fileName){
        StringBuilder stringBuilder = new StringBuilder();

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = reader.readLine())!=null){
                stringBuilder.append(line + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString().split(" ");
    }

    public static void writeFile(String fileName, String[] words){
        int count = countPalindrome(words);
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            for(String s: words){
                if(isPalindrome(s) && count > 1){
                    writer.write(s + "\n");
                    count--;
                } else if(isPalindrome(s)){
                    writer.write(s);
                }
            }

        } catch (IOException e) {
            e.getMessage();
        }
    }

    private static boolean isPalindrome(String word){
        return word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
    }

    private static int countPalindrome(String[] words){
        int counter = 0;
        for(String s: words){
            if(isPalindrome(s)){
                counter++;
            }
        }
        return counter;
    }
}
