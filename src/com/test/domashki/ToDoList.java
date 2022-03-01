package com.test.domashki;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String inputFromUser = scanner.nextLine();
            boolean isDigital = Pattern.compile("\\d+").matcher(inputFromUser).find();

            if (inputFromUser.startsWith("ADD"))
                list.add(inputFromUser.substring(4));

            if (inputFromUser.equals("LIST"))
                list.forEach(System.out::println);


            if (isDigital) {
                int numberFromUser = Integer.parseInt(inputFromUser);
                if (numberFromUser <= list.size()-1) {
                    System.out.println(list.get(numberFromUser));
                }
            }

            if (inputFromUser.startsWith("ADD " + isDigital)) {
                String textAfterADD = inputFromUser.substring(4);
                int number = Integer.parseInt(Pattern.compile("\\d+").matcher(textAfterADD).group());
                String regex = "(\\d+ )(.*)";
                String textToAdd = textAfterADD.replaceFirst(regex, "$2");
                list.add(number, textToAdd);
            }
//ADD 45 something
        }
    }
}
