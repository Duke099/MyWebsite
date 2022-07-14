package com.company;

public class D15_Pattern_17 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int row = 1; row <= 2*n-1; row++) {
            int c = row > n ? 2*n-row : row;

            for (int space = 0; space <= n - c; space++) {
                System.out.print("  ");
            }
            for (int col2 = c; col2 > 1; col2--) {
                System.out.print(col2 + " ");
            }
            for (int col1 = 1; col1 <= c; col1++) {
                System.out.print(col1 + " ");
            }
            System.out.println("");
        }
    }

}
