package lesson11.task2;
/*2)Текстовый файл содержит текст. После запуска программы в другой файл
        должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
        предложении присутствует слово-палиндром, то не имеет значения какое кол-во
        слов в предложении, оно попадает в новый файл.
        Пишем все в ООП стиле. Создаём класс TextFormater
        в котором два статических метода:
        1. Метод принимает строку и возвращает кол-во слов в строке.
        2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
        есть возвращает true, если нет false

        В main считываем файл.
        Разбиваем текст на предложения. Используя методы класса TextFormater
        определяем подходит ли нам предложение. Если подходит добавляем его в
        новый файл*/

import lesson11.task2.service.TextFormater;

import java.io.*;
//"Lesson11Task2File.txt"
public class App {
    public static void main(String[] args) {
        String[] lines = TextFormater.getSentencesArray("Lesson11Task2File.txt");
        /*for(String s: lines){
            System.out.println(s);
        }*/
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Lesson11Task2FileNew.txt"))){

            for(String s: lines){
                if((TextFormater.getNumOfWords(s) >= 3 && TextFormater.getNumOfWords(s) <= 5) || TextFormater.containsPalindrome(s)){
                    writer.write(s + "\n");
                }
                /*if(TextFormater.containsPalindrome(s)){
                    writer.write(s + "\n");
                }*//*
                writer.write(s + "\n");*/
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
