package com.company;

public class D12_Pattern_28 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int noOfspaces = row<= 5 ? n-row : row-n;
            for (int spaces = 1; spaces <= noOfspaces ; spaces++) {
                System.out.print(" ");
            }
            int ifreplace = row <= n ? row : 2*n - row;
            for (int col = 1; col <= ifreplace; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
