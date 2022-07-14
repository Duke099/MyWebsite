package com.company;

public class C04_String_03_Practice {
    public static void main(String[] args) {
        StringBuilder series = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series.append(ch);
        }
        series.deleteCharAt(0);
        series.delete(0,20);
        System.out.println(series.toString());
    }
}

