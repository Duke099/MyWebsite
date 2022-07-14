package com.company;
/*
Q:
*
**
***
****
*****
****
***
**
*
 */
public class D11_Pattern_05 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {
        //Shortform of below if statement ... (if - ? )... (else - :)
        for (int row = 1; row <= 2*n-1; row++) {
            int ifreplace = row <= n ? row : 2*n - row; // New statement so remember it
            for (int col = 1; col <= ifreplace; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }

//        for (int row = 1; row <= 2*n-1; row++) {
//            if (row <= n) {
//                for (int col = 1; col <= row; col++) {
//                    System.out.print("*");
//
//                }
//            }
//            else {
//                for (int col = 1; col <= 2*n-row  ; col++) {
//                    System.out.print("*");
//                }
//            }
//            System.out.println("");
//        }
    }
}
