package com.example;

public class StringExam01 {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");

        if (str1 == str2) {
            System.out.println("ref: str1 == str2");
        }

        if (str1.equals(str2)) {
            System.out.println("value: str1 == str2");
        }

        String s1 = str1.toUpperCase();
        System.out.println("s1 = " + s1);
        System.out.println("str1 = " + str1);

        System.out.println("---------------");

        str1 = str1.toUpperCase();
        System.out.println("str1 = " + str1);


    }

}
