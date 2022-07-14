package com.company;

public class D10_Pattern_04 {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n) {
        for (int row = 1 ; row <= n; row++) {
            System.out.print(row-1 + " ");
            //Another logic
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
//            for (int c = 4; c >= r ; c--) {
//                System.out.print("* ");
//            }
            System.out.println("");
        }
    }
}
