package com.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        DateFormat americanFormat = new SimpleDateFormat("hh:mm:ss a MM.dd.yyyy");
        Date date = new Date();
        System.out.println(americanFormat.format(date) + " - This is date of American format"); //10:57:03 PM 02.17.2022

        DateFormat russianFormat = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
        System.out.println(russianFormat.format(date)+ " - This is date of Russian format"); //22:59:37 17.02.2022
    }
}
