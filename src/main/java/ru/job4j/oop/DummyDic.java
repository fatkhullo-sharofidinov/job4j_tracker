package ru.job4j.oop;

import java.util.regex.PatternSyntaxException;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic words = new DummyDic();
        System.out.println(words.engToRus("cats"));
    }
}
