package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tes {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(){{
            add("one");
            add("two");
        }};
        System.out.println(list.contains("two"));
    }
}
