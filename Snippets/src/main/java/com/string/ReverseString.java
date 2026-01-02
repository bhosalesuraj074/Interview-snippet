package com.string;

import java.util.Arrays;

public class ReverseString {
    // Revering characters without changing the place of the string

    public static void main(String[] args) {
        String str = "This is suraj from the khavaspur";
        StringBuilder builder = new StringBuilder();
        String[] split = str.split(" ");
        for (String newString : split){
            builder.append(new StringBuilder(newString).reverse().toString()+" ");
        }

        System.out.println(builder);

    }
}
