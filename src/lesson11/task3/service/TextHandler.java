package lesson11.task3.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TextHandler {

    public static String[] getSentenceArray(String fileName){
        String[] lines = null;
        String[] blackList = null;
        try (BufferedReader reader1 = new BufferedReader(new FileReader("Lesson11Task2File.txt"))){
            String line;
            StringBuilder builder = new StringBuilder();
            while ((line = reader1.readLine()) != null){
                builder.append(line);
            }
            line = builder.toString();
            lines = line.split("\\s*(\\?|\\.|!)\\s*");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static String[] getWordsArray(String line){
        String[] words = line.split("\\s*(\\s+|,)\\s*");
        return words;
    }

    public static String[] getBlackListArray(String fileName){
        String[] blackList = null;
        try (BufferedReader reader2 = new BufferedReader(new FileReader("Lesson11Task3BlackList.txt"))){
            String line;
            StringBuilder builder = new StringBuilder();
            while ((line = reader2.readLine()) != null){
                builder.append(line + "!");
            }
            line = builder.toString();
            blackList = line.split("(\\s|!)");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return blackList;
    }

    public static void IsCensor(String[] sentences, String[] blacklist){
        int counter = 0;
        ArrayList<String> censorSentences = new ArrayList<>();

        for(int i = 0; i < sentences.length; i++){
            String[] words = getWordsArray(sentences[i]);
            for (String word: words){
                for(String blackWord: blacklist){
                    if(word.equals(blackWord)){
                        counter++;
                        censorSentences.add(sentences[i]);
                    }
                }
            }
        }
        if(counter == 0){
            System.out.println("Текст прошёл проверку на цензуру. Проблемных слов не найдено.");
        } else {
            System.out.printf("В тексте есть недопустимые слова.\nСовпадений: %d\nКоличество предложений нуждающихся " +
                    "в правке:%d\nПредложения нуждающиеся в правке:\n", counter, censorSentences.size());
            for(int i = 0; i < censorSentences.size(); i++){
                System.out.println((i + 1) + ". " + censorSentences.get(i));
            }
        }
    }

}
