package com.company;

public class C03_String_02_Efficient {
    public static void main(String[] args) {
        StringBuilder series = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series.append(ch);
        }
        System.out.println(series.toString());
    }
}
