package com.company;

import java.util.Arrays;

public class B02_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9,1,7,3,8, -2, -4, 100, 98, 65, 48, -102, 55, 12};
        selection(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {

            int last = arr.length-i-1;
            int max = GetMax(arr, 0, i);
            swap(arr, max, last);

        }

    }

    static void swap(int[] arr, int max, int last) {
        if (arr[max] > arr[last]) {
            int temp = arr[last];
            arr[last] = arr[max];
            arr[max] = temp;
        }
    }

    static int GetMax(int[] arr, int start, int j) {
        int max = start;
        for (int i = start; i < arr.length-j-1; i++) {

            if (arr[max] < arr[i]) {
                max = i;
            }

        }
        return max;
    }
}
