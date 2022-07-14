package com.company;

public class D08_Pattern_02 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {
        for (int row = 1 ; row <=n; row++) {
//            System.out.print(" * * * * * ");
            for (int col = 1; col <= row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }
    }
}
