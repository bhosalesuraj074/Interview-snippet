package com.string;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Suraj Jalindar Bhosale";
        StringBuilder builder = new StringBuilder();
        for (int i = str.length()-1 ; i>=0 ;i--){
            builder.append(str.charAt(i));
        }
        System.out.println(builder);


        char[] charArray = str.toCharArray();
        int left =0 , right = charArray.length -1;
        while (left < right){
            char  temp  = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        System.out.println(new String(charArray));
    }
}
