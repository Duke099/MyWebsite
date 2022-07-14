package com.company;

public class D16_Pattern_31 {
    public static void main(String[] args) {
        pattern(3);
    }
    static void pattern(int m) {
        int n = 2*m;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = Math.min(Math.min(col, row), Math.min(n-col, n-row));
                System.out.print(4 - atEveryIndex +  " ");
            }
            System.out.println("");
        }
    }
}
