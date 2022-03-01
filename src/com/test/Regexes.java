package com.test;

import java.text.NumberFormat;

public class Regexes {
    public static void main(String[] args) {
        String number = "7 (917)956-00-84";
        System.out.println(NumberFormat.getInstance().format(Long.parseLong(number.replaceAll("[^0-9]", ""))).substring(1));

    }
}
