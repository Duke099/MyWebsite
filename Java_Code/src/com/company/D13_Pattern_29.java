package com.company;

public class D13_Pattern_29 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int ifreplace = row<= n ? row : 2*n-row;
            for (int col = 1; col <= ifreplace ; col++) {
                System.out.print("*");
            }
            int noOfspace = row <= n ? 2*n-2*row : 2*n-2*(2*n-row);
            for (int space = 1; space <= noOfspace; space++) {
                System.out.print(" ");
            }
//            if (row <= n){
//                for (int i = 1; i <= 2*n-2*row ; i++) {
//                    System.out.print(" ");
//                }
//            } else {
//                for (int j = 1; j <=  2*n-2*(2*n-row); j++) {
//                    System.out.print(" ");
//                }
//            }
            int next = row<= n ? row : 2*n-row;
            for (int col = 1; col <= next ; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
