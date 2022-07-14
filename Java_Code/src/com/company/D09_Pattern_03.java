package com.company;
/*
1 * * * *
2 * * *
3 * *
4 *
 */
public class D09_Pattern_03 {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n) {
        for (int row = 1 ; row <= n; row++) {
            System.out.print(row + " ");
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
