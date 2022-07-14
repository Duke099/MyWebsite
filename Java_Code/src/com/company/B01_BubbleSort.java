package com.company;

import java.util.Arrays;

public class B01_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,0,5,1,9};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }

            }
            if (!swapped) {  // !swapped = false. (This statement is for saving extra steps of i if no swap accured in first (i=0) steps.)
                break;
            }

        }
    }
}
