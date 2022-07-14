package com.company;

public class D07_Patterns_01 {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n) {
        for (int r = 1; r <=n; r++) {
            for (int c = 1; c <= r ; c++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
