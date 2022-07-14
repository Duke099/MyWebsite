package com.company;

import java.util.Locale;

//Q:Palindrome is something which is read exactly same from both the sides
public class C06_StringPalindrome {
    public static void main(String[] args) {
        String word = "abcdcba";
        System.out.println(isPalindrome(word));
    }
    static boolean isPalindrome(String word) {
        if (word == null || word.length() == 0) {
            word = word.toLowerCase();
            for (int start = 0; start <= word.length()/2 ; start++) {
                char end = word.charAt(word.length()-1);
                if (start != end) {
                    return false;
                }
            }
        }
        return true;
    }
}
