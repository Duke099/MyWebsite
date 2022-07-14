package com.company;

import java.util.Arrays;

//Q:(video -20) (268 - Leetcode)
//most imp. Algorithm when 1 - - - n(when each and every numbers are present between two numbers) has to be sorted
public class B04_CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4,9,6,8,7};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr) {
        int i =  0;
        while (i < arr.length) {
            int correct = arr[i] -1;
            if (arr[i] != arr[correct]) {
                swap(arr, correct, i);
            }
            else {
                i++;
            }

        }
    }
    static void swap(int[] arr, int correct, int i) {
        int temp = arr[correct];
        arr[correct] = arr[i];
        arr[i] = temp;

    }

}
