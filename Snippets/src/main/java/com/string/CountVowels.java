package com.string;

public class CountVowels {
    public static void main(String[] args) {
        String string = "This is suraj from the khavaspur";
        int i =0, counter = 0;
        while (i < string.length()){
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i'|| string.charAt(i) == 'o'|| string.charAt(i) == 'u'){
                counter++;
            }
            i++;
        }
        System.out.println(String.format("Number of the vowels in the given string %d", counter));
    }
}
