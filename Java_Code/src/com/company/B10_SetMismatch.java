package com.company;

//Q:(5-Video-20) (645 - leetcode) - Here we have to use two hybrid of missing and repeating


import java.util.Arrays;


public class B10_SetMismatch {
    public static void main(String[] args) {
        int[] arr = {3,2,2};
        int[] ans = cyclic(arr);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(arr));
    }

    static int[] cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct] && arr[i] <= arr.length) {
                swap2(arr, i, correct);
            }
            else{
                i++;
            }
        }

        for(int index = 0; index<arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[] {arr[index], index+1};
            }
    }
        return new int[] {-1,-1};
}
    static void swap2(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
