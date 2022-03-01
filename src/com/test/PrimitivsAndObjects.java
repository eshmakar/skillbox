package com.test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class PrimitivsAndObjects {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);
        double d = currentTimeMillis;
        System.out.println(d);
        System.out.println(NumberFormat.getInstance().format(d));


//        multiplays(3,2);
//        divides(3,2);
    }

    public static void multiplays(double a, double b) {
        System.out.println(BigDecimal.valueOf(a).multiply(BigDecimal.valueOf(b)));
    }

    public static void divides(double a, double b) {
        System.out.println(BigDecimal.valueOf(a).divide(BigDecimal.valueOf(b), RoundingMode.FLOOR));
    }

}
