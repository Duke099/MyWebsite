package com.company;

public class D14_Pattern_30 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("  ");
            }
            for (int col1 = row; col1 > 1; col1--) {
                System.out.print(col1 + " ");
            }
            for (int col2 = 1; col2 <= row; col2++) {
                System.out.print(col2 + " ");
            }
            System.out.println("");
        }
    }
}