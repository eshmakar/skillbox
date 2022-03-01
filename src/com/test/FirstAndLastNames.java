package com.test;

import java.text.NumberFormat;

public class FirstAndLastNames {
    public static void main(String[] args) {
        String names = "";
        String name;
        String surname;
        String patronymic;


        long start = System.nanoTime();
        String[] strings = names.split(" ");
        int countOfWords = strings.length;
        surname = countOfWords > 0 ? strings[0] : "";
        name = countOfWords > 1 ? strings[1] : "";
        patronymic = countOfWords > 2 ? strings[2] : "";
        long time = System.nanoTime() - start;
//401 000 - 483 000


        System.out.println("Фамилия: " + surname);
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + patronymic);
        System.out.println(NumberFormat.getInstance().format(time));
    }
}
