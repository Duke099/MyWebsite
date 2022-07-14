package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C05_String_04_DifferentStringFunctions {
    public static void main(String[] args) {
        String name  = "Captain America";
        System.out.println(Arrays.toString( name.toCharArray()));
        System.out.println(name.indexOf('r'));
        System.out.println(name);
        System.out.println(Arrays.toString(name.split(" ")));

    }
}
