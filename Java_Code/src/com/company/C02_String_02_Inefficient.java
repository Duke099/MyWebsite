package com.company;

public class C02_String_02_Inefficient {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series += ch;
        }
        System.out.println(series);
    }
}
