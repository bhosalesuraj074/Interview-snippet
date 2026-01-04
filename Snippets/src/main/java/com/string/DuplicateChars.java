package com.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateChars {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("This is Suraj Bhosale form the khavaspur");
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < builder.length(); i++) {
                 if (builder.charAt(i) == ' ') continue;
            for (int j = i+ 1; j < builder.length(); j++) {
                if(builder.charAt(i) == builder.charAt(j)){
                    characters.add(builder.charAt(i));
                }
            }
        }

        System.out.println(characters);

    }
}
