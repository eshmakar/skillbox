package com.test;

public class This {
    public static void main(String[] args) {
        new Constructor("Hello");
    }
}

class Constructor{
    Constructor(){
        System.out.println("This is default constructor");
    }

    Constructor(String name){
        this();
        System.out.println("This is constructor with String name");
    }
}
//    OUTPUT:
//    This is default constructor
//    This is constructor with String name