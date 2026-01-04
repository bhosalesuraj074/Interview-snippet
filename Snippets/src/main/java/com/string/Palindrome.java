package com.string;

public class Palindrome {
    public static void main(String[] args) {
        String str = "suraj";
        boolean flag = new StringBuilder(str).reverse().toString().equals(str);
        System.out.println(flag);

    }
}
