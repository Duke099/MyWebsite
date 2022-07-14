package com.company;

import java.util.Arrays;

public class B03_InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9,5,7,3,8};
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j);
                } else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int j) {
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;

    }
}
