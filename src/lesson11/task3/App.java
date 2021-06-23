package lesson11.task3;
/*3) Проверка на цензуру:
        Создаете 2 файла.
        1 - й. Содержит исходный текст.
        2 - й. Содержит слова недопустимые в тексте(black list). Структура файла
        определите сами, хотите каждое слово на новой строке, хотите через запятую
        разделяйте, ваша программа делайте как считаете нужным.
        Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
        встретилось ни одного недопустимого слова, то выводите сообщение о том что
        текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
        сообщение, кол-во предложений не прошедших проверку и сами предложения
        подлежащие исправлению.*/
import lesson11.task3.service.TextHandler;

import java.io.*;

public class App {
    public static void main(String[] args) {
        String[] lines = TextHandler.getSentenceArray("Lesson11Task2File.txt");
        String[] blackList = TextHandler.getBlackListArray("Lesson11Task3BlackList.txt");
        TextHandler.IsCensor(lines, blackList);

    }
}
